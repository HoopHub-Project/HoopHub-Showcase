package com.hoophub.showcase.authentication;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseToken;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

import static com.hoophub.showcase.authentication.FirebaseAuthenticationToken.getAuthoritiesFromToken;

public class FirebaseAuthenticationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String idToken = request.getHeader("Authorization");
        if(idToken == null || idToken.isEmpty()){
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Missing Firebase token");
            return;
        }
        try{
            FirebaseToken token = FirebaseAuth.getInstance().verifyIdToken(idToken.replace("Bearer ",""));
            List<GrantedAuthority> authorities = getAuthoritiesFromToken(token);
            SecurityContextHolder.getContext().setAuthentication(new FirebaseAuthenticationToken(idToken, token, authorities));
            SecurityContextHolder.getContext().getAuthentication().setAuthenticated(true);
        }
        catch (Exception e){
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid Firebase token");
            return;
        }
        filterChain.doFilter(request,response);
    }
}
