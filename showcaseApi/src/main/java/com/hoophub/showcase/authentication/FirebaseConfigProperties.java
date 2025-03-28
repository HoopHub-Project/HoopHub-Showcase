package com.hoophub.showcase.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "firebase")
public class FirebaseConfigProperties {
    private String type;
    private String project_id;
    private String privateKey;
    private String private_key_id;
    private String client_email;
    private String clientId;
    private String tokenUri;
    private String url;
}
