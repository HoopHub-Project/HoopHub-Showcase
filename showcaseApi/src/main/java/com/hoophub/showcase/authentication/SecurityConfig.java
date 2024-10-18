package com.hoophub.showcase.authentication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@Slf4j
public class SecurityConfig {

    public static final String API_BASE_PATH = "/api/**";

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.securityMatcher(API_BASE_PATH)
                .cors(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .addFilter(new FirebaseAuthenticationFilter())
                .authorizeHttpRequests(authorizeRequest -> authorizeRequest.requestMatchers(API_BASE_PATH).authenticated());
        return http.build();
    }
}
