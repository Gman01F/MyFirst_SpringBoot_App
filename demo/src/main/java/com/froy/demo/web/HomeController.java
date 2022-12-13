package com.froy.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.froy.demo.domain.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("formData", new User());
		return "index";
	}

	@RequestMapping(value="/create",method=RequestMethod.POST)
	public String processFormdata(User user) {
		return "result";
	}
}
