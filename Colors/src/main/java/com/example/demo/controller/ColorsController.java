package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ColorsController {
@GetMapping("/")
public String displayColors( @RequestParam(defaultValue = "blue") String colors,Model model) {
	System.out.println(colors);
	model.addAttribute("selectedcolor",colors);
	return "color";
}
}
