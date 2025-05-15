package com.springbootsecurity.springbootsecurityauthentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authenticationcontroller {
	
	@GetMapping("/") 
	public String accessAll() {
		return "Access All";
	}
	
	@GetMapping("/user")
	public String accessUser() {
		return "Access User";
	}
	
	@GetMapping("/admin")
	public String accessAdmin() {
		return "Access Admin";
	}

}
