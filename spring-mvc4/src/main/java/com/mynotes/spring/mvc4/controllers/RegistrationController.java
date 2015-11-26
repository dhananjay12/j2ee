package com.mynotes.spring.mvc4.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mynotes.spring.mvc4.model.RegistrationModel;

@Controller
public class RegistrationController {
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String displayRegistrationPage(Model model) {
		
		RegistrationModel form = new RegistrationModel();		
		model.addAttribute("registrationModel", form);		
		return "registration";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String processRegistrationPage(@Valid RegistrationModel form, BindingResult errors, Model model) {
		
		System.out.println(form);	
		if(errors.hasErrors()){
			return "registration";
		}
		return "success";		
	}

}
