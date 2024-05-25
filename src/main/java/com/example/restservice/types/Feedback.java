package com.example.restservice.types;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="FEEDBACKS")
public class Feedback {

    @Id
    private int id;

    private String feedback;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

}