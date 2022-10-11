package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringControllerClass {

	
		@GetMapping("/")
		public String getMessage() {
			return "Hello All!!!!!";
		}
}
