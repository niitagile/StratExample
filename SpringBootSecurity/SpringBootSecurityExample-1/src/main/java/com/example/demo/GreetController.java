
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/")
	public String getMessage() {
		return "<h1> Hello All</h1>";
	}

	@GetMapping("/greet")
	public String getGreet() {
		return "<h1> Goodmorning all</h1>";
	}
	
}