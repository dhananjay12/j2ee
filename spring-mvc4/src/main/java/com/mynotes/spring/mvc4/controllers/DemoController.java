package com.mynotes.spring.mvc4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping(value = "/greeting")
	public String greeting(Model model) {
		System.out.println("greeting called");
		model.addAttribute("greeting", "Greetings Everyone!!");
		
		return "greetings";
	}

}
