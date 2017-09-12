package com.howtoprogram.unit5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello-world")
	public String hello() {
		return "Hello World";
	}

}