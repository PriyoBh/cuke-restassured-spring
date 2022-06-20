package io.gorest.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.spring.ScenarioScope;
import io.restassured.RestAssured;
import io.gorest.config.CucumberConfig;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@ScenarioScope
//@Scope(SCOPE_CUCUMBER_GLUE)
public class APIHelper {

    @Autowired
    private CucumberConfig cukeConfig;
    private final String shieldAuthLogin = "/shield/api/v1/auth/login";
    private final Map<String, String> requestHeadersAuth = new HashMap<String, String>();
    private final Map<String, String> requestHeaders = new HashMap<>();
    private final Map<String, String> loginBody = new HashMap<String, String>();
    private String accessToken ;

/*
    public String getTokenFromShield() throws JsonProcessingException {

        RestAssured.baseURI = cukeConfig.getBaseUrl();
        requestHeadersAuth.put("Content-Type", "application/json");
        requestHeadersAuth.put("Origin", cukeConfig.getBackOfficeOrigin());
        loginBody.put("email", cukeConfig.getUserId());
        loginBody.put("password", cukeConfig.getPassword());
        String loginBodyAsJSON = new ObjectMapper().writeValueAsString(loginBody);
        Response response = RestAssured.given().headers(requestHeadersAuth).body(loginBodyAsJSON).when().
                post(shieldAuthLogin).then().extract().response();
        return response.path("token.accessToken");

    }
*/
    public Response get(String url) {
        RestAssured.baseURI = cukeConfig.getBaseUrl();
        accessToken = cukeConfig.getAccessToken();
        requestHeaders.put("Content-Type", "application/json");
        requestHeaders.put("Authorization", "Bearer " + accessToken);
        Response response = RestAssured.given().headers(requestHeaders).log().all().when().get(url);
        System.out.println("Response: --> " + response);
        return response;
    }

}
