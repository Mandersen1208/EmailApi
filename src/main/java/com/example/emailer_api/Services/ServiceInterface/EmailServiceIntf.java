package com.example.emailer_api.Services.ServiceInterface;

import com.example.emailer_api.DTO.EmailDTO;

public interface EmailServiceIntf {

    void sendEmail(EmailDTO emailDTO);
}
