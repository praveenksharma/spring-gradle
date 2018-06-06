package com.pravs.spring.grade.models;

import org.springframework.stereotype.Service;

@Service
public class Logger implements ILogger {

    public void info(String msg) {
        System.out.println("I am the main logger and the message is: " + msg);
    }
}
