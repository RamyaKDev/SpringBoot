package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculator_Conroller {

	@GetMapping("/")
	public String displayCalc() {
		return "calc";
	}
	
	@PostMapping("/calculated")
	public String resultCalc(@RequestParam double Number1,@RequestParam double Number2,
			@RequestParam String Operation,Model model ) {
		model.addAttribute("num1", Number1);
		model.addAttribute("num2", Number2);
		model.addAttribute("ops", Operation);
		double result=0;
		String assign="=";
		switch(Operation) {
		case "+":
			result=Number1+Number2;
			break;
		case "-":
			result=Number1-Number2;
			break;
		
		case "*":
			result=Number1*Number2;
			break;
		case "/":
			result=Number1/Number2;
			break;	
		
		}
		model.addAttribute("res", result);
		model.addAttribute("assign", assign);
		
		
		
		return "calc";
	}
	
}
