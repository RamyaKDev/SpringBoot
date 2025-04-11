package com.example.demo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class Contoller_demo {
//@GetMapping("/welcome")
//public  @ResponseBody String display() {
//	return "Hello SpringBoot";
//}

@RestController
public class Contoller_demo {
@GetMapping("/welcome")

public String display() {
	return "RestController";
}
}
