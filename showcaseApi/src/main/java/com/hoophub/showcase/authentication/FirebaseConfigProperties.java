package com.hoophub.showcase.authentication;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "firebase")
public class FirebaseConfigProperties {
    private String type;
    private String projectId;
    private String privateKey;
    private String privateKeyId;
    private String clientEmail;
    private String clientId;
    private String tokenUri;
    private String url;
}
