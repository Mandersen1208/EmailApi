package com.example.emailer_api.DTO;

import jakarta.annotation.Nonnull;

import java.util.List;


public class EmailDTO {
    @Nonnull
    private List<String> email;

    private String emailBody;

    public EmailDTO() {
        email = List.of();
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    @Nonnull
    public List<String> getEmail() {
        return email;
    }

    public void setEmail(@Nonnull List<String> email) {
        this.email = email;
    }
}
