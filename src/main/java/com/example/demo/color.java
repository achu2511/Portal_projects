package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	@GetMapping("/color")
	public String col() {
		String col="Green";
		return "My fav color is "+col;
	}
}
