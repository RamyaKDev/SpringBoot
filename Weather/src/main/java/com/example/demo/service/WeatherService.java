package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.WeatherModel;

@Service
public class WeatherService {
	@Value("${apikey}")
private String api_key;
	private String api_url="https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";
	
	public WeatherModel getdetails(String city) {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate.getForObject(api_url,WeatherModel.class,city,api_key );
	}
}
