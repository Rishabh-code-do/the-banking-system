package com.rishabh.the_banking_system.service;

import com.rishabh.the_banking_system.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
