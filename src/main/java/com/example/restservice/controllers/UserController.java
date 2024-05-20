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

import com.example.restservice.repository.UserRepository;
import com.example.restservice.types.User;
import com.example.restservice.types.UserRequestBody;




@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

	@CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/users")
	public ResponseEntity<User> getUserByNameAndPass(@RequestBody UserRequestBody user) {
		Optional<User> userData = userRepository.findByNameAndPass(user.name,user.pass);
		if (userData.isPresent()) {
			return new ResponseEntity<>(userData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
