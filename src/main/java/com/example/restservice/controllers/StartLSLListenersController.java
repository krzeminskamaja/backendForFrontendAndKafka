package com.example.restservice.controllers;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.restservice.types.StartLSLListenersBody;

public class StartLSLListenersController {
    
    @CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/startListeners")
	  ResponseEntity<Void> redirect(@RequestBody StartLSLListenersBody startLSLListenersBody) {
        return ResponseEntity.status(HttpStatus.FOUND)
        .location(URI.create("http://www.yahoo.com"))
        .build();
  }
}
