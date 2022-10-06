package com.gourabix.herokudemo.helloHeroku.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloHerokuController {

    private static final Logger LOGGER = LogManager.getLogger(HelloHerokuController.class);

    @GetMapping("/user/{username}")
    public ResponseEntity<Map<String, String>> findUserDetails(HttpServletRequest request, @PathVariable String username) {
        LOGGER.info("Executing findUserDetails()...");

        Map<String, String> userDetails = new HashMap<>();
        userDetails.put("name", username);
        userDetails.put("greeting", "Hello, " + username);
        userDetails.put("ip", request.getRemoteAddr());

        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }

}
