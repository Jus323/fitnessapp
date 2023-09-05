package com.fitness.app.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Exchanger;

@Service
public class PaLMAPIService {
    @Value("${external.api.key}")
    private String apiKey;
    public ResponseEntity<String> callExternalApi() {
        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

        String apiUrl = "https://generativelanguage.googleapis.com/v1beta2/models?key=" + apiKey;
        System.out.println("TEST");
        ResponseEntity<String> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.GET,
                null,
                String.class,
                headers
        );

        return response;
    }

}
