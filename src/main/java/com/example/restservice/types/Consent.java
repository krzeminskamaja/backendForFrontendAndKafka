package com.example.restservice.types;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CONSENTS")
public class Consent {

    @Id
    private int id;

    private String consentId;

    private String sessionId; 

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String id) {
        this.consentId = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String id) {
        this.sessionId = id;
    }

}