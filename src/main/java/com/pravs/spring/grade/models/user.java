package com.pravs.spring.grade.models;

public class user {
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
}
