package com.froy.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping("/basic")
	public String sayHello() {
		return "<h1>Hello, world!!!</h1>";

	}

	@RequestMapping("/proper")
	public String sayProperHello() {
		return "<h1>Hello, how are you?</h1>";
	}
}
