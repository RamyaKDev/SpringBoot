package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	Logger logger=LoggerFactory.getLogger(HelloController.class);
	
@GetMapping
public String hello() {
	//logger.info("Hello console logger msg");
	logger.debug("Hello console logger debug msg");
	return "Hello Logger SLF4J";
}
}
