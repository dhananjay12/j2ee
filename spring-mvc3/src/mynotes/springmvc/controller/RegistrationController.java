package mynotes.springmvc.controller;

import java.util.List;

import mynotes.springmvc.form.RegistrationForm;
import mynotes.springmvc.util.RegistrationValidator;

import org.apache.catalina.tribes.transport.RxTaskPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationValidator registrationValidator;

	@RequestMapping(value = "/registrationIntro", method = RequestMethod.GET)
	public String registrationIntro() {

		System.out.println("Inside registrationIntro");

		return "registration_intro";
	}

	@RequestMapping(value = "/intializeRegistration", method = RequestMethod.GET)
	public ModelAndView initializeRegistration() {

		System.out.println("Inside initializeRegistration");
		ModelAndView mav = new ModelAndView();
		mav.addObject("refistrationForm", new RegistrationForm());
		mav.setViewName("registration");

		return mav;
	}

	@RequestMapping(value = "/cancelRegistration", method = RequestMethod.GET)
	public ModelAndView cancelRegistration() {

		System.out.println("Inside cancelRegistration");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("registration_intro");

		return mav;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(
			@ModelAttribute("refistrationForm") RegistrationForm registrationForm,
			BindingResult results) {

		System.out.println("Inside register");
		System.out.println("registrationForm==>" + registrationForm);
		ModelAndView mav = new ModelAndView();
		mav.addObject("refistrationForm", new RegistrationForm());
		registrationValidator.validate(registrationForm, results);

		if (results.hasErrors()) {
			mav.setViewName("registration");
		} else {
			mav.setViewName("registration_success");
		}

		return mav;
	}

}
