package org.tms.model;

import lombok.*;

@Getter
@Setter
public class User {
    private String name;
    private String firstName;
    private String lastName;
    private String password;
    private String zipCode;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

}