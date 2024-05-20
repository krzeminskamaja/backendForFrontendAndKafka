package com.example.restservice.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.repository.ConsentRepository;
import com.example.restservice.repository.UserRepository;
import com.example.restservice.types.Consent;
import com.example.restservice.types.ConsentBody;
import com.example.restservice.types.User;
import com.example.restservice.types.UserRequestBody;




@RestController
@RequestMapping("/api")
public class ConsentController {
    @Autowired
    ConsentRepository consentRepository;

	@CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/consents")
	public ResponseEntity<User> saveConsentId(@RequestBody ConsentBody consent) {
        int howManyConsents = consentRepository.findAll().size();
        System.out.println(consent.sessionID);
        for(int i=0;i<consent.consents.length;i++){
            if(consent.consents[i].trim()!="")
            {
                Consent c = new Consent();
                c.setId(howManyConsents++);
                c.setConsentId(consent.consents[i]);
                c.setSessionId(consent.sessionID);
                consentRepository.save(c);

            }
                
        }
        return new ResponseEntity<>(HttpStatus.OK);
	}

}