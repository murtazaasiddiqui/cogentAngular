package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "/rest/hello")
public class HelloWorldController {
	@GetMapping("/sayHello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Greeting " + name + "!. How are you?";
		
	}
}
