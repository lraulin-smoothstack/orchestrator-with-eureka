package com.smoothstack.december.orchestrationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BorrowerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(path = "/lms/author", method = RequestMethod.GET)
    public String getAuthor() {

        ResponseEntity<String> response = restTemplate.getForEntity("http://author-service/lms/author", String.class);
        return response.getBody();
    }

    @RequestMapping(path = "/lms/book", method = RequestMethod.GET)
    public String getBook() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://book-service/lms/book", String.class);
        return response.getBody();
    }
}
