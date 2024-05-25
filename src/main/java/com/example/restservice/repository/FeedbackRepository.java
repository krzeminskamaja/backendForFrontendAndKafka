package com.example.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restservice.types.Feedback;

public interface  FeedbackRepository  extends JpaRepository<Feedback, Integer> {

    
}