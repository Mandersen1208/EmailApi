package com.example.emailer_api.Services.ServiceInterface;

import com.example.emailer_api.DTO.EmailDTO;

public interface EmailServiceIntf {

    String sendEmail(EmailDTO emailDTO);
    String sendEmailWithAttachments(EmailDTO emailDTO);
}
