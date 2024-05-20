package com.example.restservice.types;

import java.io.Serializable;


public class ConsentBody implements Serializable {
    public String sessionID;
    public String[] consents;
}
