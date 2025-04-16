package com.example.demo.Service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class QuoteService {
	
	public String sendQuote() {
List<String> quoteslist=List.of(
		"Failure is a stepping stone of Success",
		"Hardwork never fails",
		"A Journey starts from a single step",
		"Practise makes Perfect",
		"Time is Gold",
		"Never loose your hope");
Random random=new Random();
int randomNo=random.nextInt(quoteslist.size());

	return quoteslist.get(randomNo);
	}

}
