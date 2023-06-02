package com.example.demo.email;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("emailConfirm")
    public String mailConfirm(@RequestBody EmailConfirmRequestDto emailConfirmRequestDto) throws MessagingException, UnsupportedEncodingException {
        String authCode = emailService.sendEmail(emailConfirmRequestDto.getEmail());

        return authCode;
    }

}




