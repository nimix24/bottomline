package com.bottom.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private int counter = 1;
	@GetMapping("/")
	public String index() {
		return "hello-world " + counter++;
	}

}