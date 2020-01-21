package com.smoothstack.december.orchestrationservice.controller;

import com.smoothstack.december.orchestrationservice.client.BorrowerClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BorrowerController {
    @Autowired
    BorrowerClient borrowerClient;

    @GetMapping("/library-branches")
    public ResponseEntity<?> getLibraryBranches() {
        return ResponseEntity.ok(borrowerClient.getLibraryBranches());
    }
}