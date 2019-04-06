package com.techstack.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karthikeyan N
 *
 */
@RequestMapping("/")
@RestController
public class HelloController {

	@GetMapping
	public String sayHello() {
		return "Hello World, from Spring boot on PCF";
	}
}
