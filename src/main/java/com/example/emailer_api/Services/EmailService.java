package com.example.emailer_api.Services;

import com.example.emailer_api.DTO.EmailDTO;
import com.example.emailer_api.Services.ServiceInterface.EmailServiceIntf;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailServiceIntf {

    @Override
    public String sendEmail(EmailDTO emailDTO) {
        return "Email sent successfully!";
    }

    @Override
    public String sendEmailWithAttachments(EmailDTO emailDTO) {
        return "this email was completed";
    }

}
