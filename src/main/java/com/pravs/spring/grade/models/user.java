package com.pravs.spring.grade.models;

import org.springframework.context.annotation.Configuration;

public class user implements IUser {
    private final long id;
    private final String firstName;
    private final String lastName;

    public user(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
