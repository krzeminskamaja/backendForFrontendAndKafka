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
import com.example.restservice.repository.FeedbackRepository;
import com.example.restservice.repository.UserRepository;
import com.example.restservice.types.Consent;
import com.example.restservice.types.ConsentBody;
import com.example.restservice.types.Feedback;
import com.example.restservice.types.FeedbackBody;
import com.example.restservice.types.User;
import com.example.restservice.types.UserRequestBody;




@RestController
@RequestMapping("/api")
public class FeedbackController {
    @Autowired
    FeedbackRepository feedbackRepository;

	@CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/feedbacks")
	public ResponseEntity<User> saveFeedback(@RequestBody FeedbackBody feedbackBody) {
        int howManyFeedbacks = feedbackRepository.findAll().size();
        Feedback feedback = new Feedback();
        feedback.setId(howManyFeedbacks);
        feedback.setFeedback(feedbackBody.feedback);
        feedbackRepository.save(feedback);
        return new ResponseEntity<>(HttpStatus.OK);
	}

}