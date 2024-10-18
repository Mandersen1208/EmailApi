package com.example.emailer_api.Controllers;

import com.example.emailer_api.DTO.EmailDTO;
import com.example.emailer_api.Services.ServiceInterface.EmailServiceIntf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailServiceIntf emailService;

    @PostMapping("/send-email")
    public String sendEmail(@RequestBody EmailDTO emailDTO) {
        emailService.sendEmail(emailDTO);
        return "Email sent successfully!";
    }
}
