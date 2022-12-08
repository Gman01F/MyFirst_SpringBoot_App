package com.froy.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value = "/user_entry")
	public String userForm() {
		return "<form action=\"/greeting/user_greeting\" method = \"GET\">\r\n"
				+ "  <label for=\"fname\">firstname:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"fname\" name=\"fname\">\r\n"
				+ "  <label for=\"lname\">lastname:</label><br>\r\n"
				+ "  <input type=\"text\" id=\"lname\" name=\"lname\">\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form> ";
	}
	
	@RequestMapping(value = "/user_greeting", method = RequestMethod.GET)
	public String printUserGreeting(@RequestParam String fname , @RequestParam String lname) {
		return "Hello, " + fname + " " + lname;
	}
	
	@RequestMapping(value = "/orders/{id}", method = RequestMethod.GET)
	public String getOrder(@PathVariable String id) {
		return "Your order is: " + id;
	}
}
