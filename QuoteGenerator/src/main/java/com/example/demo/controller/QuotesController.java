package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Service.QuoteService;
//http:localhost:8090/
@Controller
public class QuotesController {

	@Autowired
	private QuoteService quoteservice;
	@GetMapping("/")
	public String getQuote(Model model) {
		String quotes=quoteservice.sendQuote();
		model.addAttribute("quo",quotes);
		return "Quotes";
	}
}
