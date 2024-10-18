package com.example.emailer_api.Services;

import com.example.emailer_api.DTO.EmailDTO;
import com.example.emailer_api.Services.ServiceInterface.EmailServiceIntf;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailServiceIntf {

    @Override
    public void sendEmail(EmailDTO emailDTO) {
        //this did a thing
    }

}
