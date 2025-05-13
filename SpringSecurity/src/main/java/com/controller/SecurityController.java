package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
@GetMapping("/welcome")
public String display() {
	return "WELCOME To Spring Security";
}
}
