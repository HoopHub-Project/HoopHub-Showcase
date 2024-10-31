package com.hoophub.showcase.authentication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Configuration
@Slf4j
public class FirebaseConfig {

    @Autowired
    private FirebaseConfigProperties firebaseConfigProperties;

    @PostConstruct
    public void initialize(){
        try {
            firebaseConfigProperties.setPrivateKey(firebaseConfigProperties.getPrivateKey().replace("\\n","\n"));
            String json = new Gson().toJson(firebaseConfigProperties);
            GoogleCredentials credentials = GoogleCredentials.fromStream(new ByteArrayInputStream(json.getBytes()));
            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(credentials)
                    .setDatabaseUrl(firebaseConfigProperties.getUrl())
                    .build();
            FirebaseApp.initializeApp(options);
            log.info("Firebase initialized for URL {}", firebaseConfigProperties.getUrl());
        }
        catch (IOException e){
            log.error("Firebase config error {}", e.getMessage());
        }
    }

    @Bean
    public FirebaseAuth firebaseAuth(){
        return FirebaseAuth.getInstance();
    }
}
