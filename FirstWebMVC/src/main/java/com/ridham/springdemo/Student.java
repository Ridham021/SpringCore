package com.ridham.springdemo;

import javax.validation.constraints.*;

public class Student {
    private String firstName;
    @NotNull(message = "is Required")
    @Size(min=1,message="is required")
    private String lastName;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
