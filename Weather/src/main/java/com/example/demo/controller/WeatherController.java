package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.WeatherModel;
import com.example.demo.service.WeatherService;

//http://localhost:8084/weather/

@Controller()
@RequestMapping("/weather")

public class WeatherController {
	@Autowired
	private WeatherService weatherService;
@GetMapping("/")

public String displayWeather() {
	return "HomeWeather";
}

@GetMapping("/weather_result")
public String getWeather(@RequestParam String city,Model model) {
	WeatherModel result=weatherService.getdetails(city);
	model.addAttribute("weatherdetails",result);
	return "HomeWeather";
}
}
