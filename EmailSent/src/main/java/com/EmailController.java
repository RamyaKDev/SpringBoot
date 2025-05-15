package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.mail.MessagingException;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class EmailController {
	 @Autowired
	    private EmailService emailService;

	    @GetMapping("/send-email")
	    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String text) throws MessagingException {
	        emailService.sendHtmlEmail(to, subject, text);
	        return "Email sent successfully";
	    }

}
