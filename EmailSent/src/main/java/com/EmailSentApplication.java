package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailSentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSentApplication.class, args);
	}

}
//localhost:9898/send-email?to="ramyakpass@gmail.com"&subject="EMailTEST"&text="EMAILTEST"
