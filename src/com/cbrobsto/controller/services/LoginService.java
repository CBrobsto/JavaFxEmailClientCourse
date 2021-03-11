package com.cbrobsto.controller.services;

import com.cbrobsto.EmailManager;
import com.cbrobsto.controller.EmailLoginResult;
import com.cbrobsto.model.EmailAccount;

public class LoginService {

    EmailAccount emailAccount;
    EmailManager emailManager;

    public LoginService(EmailAccount emailAccount, EmailManager emailManager) {
        this.emailAccount = emailAccount;
        this.emailManager = emailManager;
    }

    public EmailLoginResult login() {
        return EmailLoginResult.SUCCESS;
    }
}
