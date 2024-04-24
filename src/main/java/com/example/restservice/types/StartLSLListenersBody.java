package com.example.restservice.types;

import java.io.Serializable;


public class StartLSLListenersBody implements Serializable{
    public String deviceType1;
    public String deviceType2;
    
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Type of device 1: ");
        stringBuilder.append(deviceType1);
        stringBuilder.append("\nType of device 2: ");
        stringBuilder.append(deviceType2);
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
