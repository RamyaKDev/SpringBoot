package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository("springRepository")
public class StereotypeRepository {
	
		public String getRepository() {
			return "Stereotype Repository";
		}
}
