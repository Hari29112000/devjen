package com.devjen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenController {
	
	@GetMapping (value="/get")
	public String getThis() {
		return "HelloWorld";
		
	}
}
