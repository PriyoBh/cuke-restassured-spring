package io.gorest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

@ConfigurationProperties(prefix = "cucumber", ignoreUnknownFields = true)
public class CucumberConfig {
    private String baseUrl;
    private String accessToken;

    @PostConstruct
    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setBaseUrl(String url) {
        this.baseUrl = url;
    }

    @PostConstruct
    public String getAccessToken() {return this.accessToken;}

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
