package com.fitness.app.controller;

import com.fitness.app.service.PaLMAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/palmapi")
public class PaLMAPIController {
    @Autowired
    private PaLMAPIService paLMAPIService;

    @GetMapping
    public ResponseEntity<String> test() {
        return paLMAPIService.callExternalApi();
    }
}
