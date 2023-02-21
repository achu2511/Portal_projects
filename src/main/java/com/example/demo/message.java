package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class message {
	@Value("${nam.value}")
	public String mes;
	
	@GetMapping("/mess")
	public String me() {
		return mes;
	}
}
