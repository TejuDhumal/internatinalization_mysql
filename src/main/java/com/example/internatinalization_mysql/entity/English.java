package com.example.internatinalization_mysql.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class English {
    private String firstName;
    private String feedback;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
