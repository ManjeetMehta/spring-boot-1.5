package com.mehta.applications.social.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mehta.applications.common.constants.ApplicationConstants;

@RestController
@RequestMapping(value = ApplicationConstants.OPERATION_REGISTRATION)
public class RegistrationController<modelAndView> {

	@RequestMapping(method= RequestMethod.GET)
	public ModelAndView getRegistration(){
		return new ModelAndView("/registration");
	}
	
}
