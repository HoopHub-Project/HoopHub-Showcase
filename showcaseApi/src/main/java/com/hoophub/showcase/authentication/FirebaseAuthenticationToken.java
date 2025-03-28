package com.hoophub.showcase.authentication;

import com.google.firebase.auth.FirebaseToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.authentication.AbstractAuthenticationToken;

import java.util.Collection;
import java.util.List;

public class FirebaseAuthenticationToken extends AbstractAuthenticationToken{

    private FirebaseToken firebaseToken;
    private String idToken;

    public FirebaseAuthenticationToken(Collection<? extends GrantedAuthority> authorities){
        super(authorities);
    }

    public FirebaseAuthenticationToken(String idToken, FirebaseToken firebaseToken, List<GrantedAuthority> authorities){
        super(authorities);
        this.idToken = idToken;
        this.firebaseToken = firebaseToken;
    }

    protected static List<GrantedAuthority> getAuthoritiesFromToken(FirebaseToken token) {
        Object claims = token.getClaims().get("authorities");
        List<String> permissions = (List<String>) claims;
        List<GrantedAuthority> authorities = AuthorityUtils.NO_AUTHORITIES;
        if (permissions != null && !permissions.isEmpty()) {
            authorities = AuthorityUtils.createAuthorityList(permissions);
        }
        return authorities;
    }

    @Override
    public Object getCredentials() {
        return this.idToken;
    }

    @Override
    public Object getPrincipal() {
        return this.firebaseToken.getUid();
    }

}
