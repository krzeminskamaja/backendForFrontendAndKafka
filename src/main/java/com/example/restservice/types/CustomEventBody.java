package com.example.restservice.types;

import java.io.Serializable;


public class CustomEventBody implements Serializable{
    public String eventType;
    public String eventDescription;
    public String who;
    public String when;
    
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type of event: ");
        stringBuilder.append(eventType);
        stringBuilder.append("\nEvent description: ");
        stringBuilder.append(eventDescription);
        stringBuilder.append("\nWho: ");
        stringBuilder.append(who);
        stringBuilder.append("\nWhen: ");
        stringBuilder.append(when);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
