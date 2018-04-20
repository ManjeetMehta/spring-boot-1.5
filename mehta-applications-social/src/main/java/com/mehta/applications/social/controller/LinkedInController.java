package com.mehta.applications.social.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.linkedin.api.LinkedInProfile;
import org.springframework.social.linkedin.api.ProfileOperations;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mehta.applications.common.constants.ApplicationConstants;

@RestController
@RequestMapping(value = ApplicationConstants.LINKEDIN_BASE_URL)
public class LinkedInController<modelAndView> {

	@Autowired
	private LinkedIn linkedIn;

	@Autowired
	private ConnectionRepository connectionRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloFacebook(Model model) {
		if (connectionRepository.findPrimaryConnection(LinkedIn.class) == null) {
			return new ModelAndView("redirect:/connect/linkedin");
		}
		ProfileOperations user = linkedIn.profileOperations();
		System.out.println(user);
		model.addAttribute("linkedInProfile", linkedIn.profileOperations().getUserProfileFull());

		return new ModelAndView("/connect/linkedinProfile");

	}

	@RequestMapping(value = ApplicationConstants.OPERATION_LINKEDIN_TIMELINE, method = RequestMethod.GET)
	public LinkedInProfile getSearchedTweet(@PathVariable final String timeline) {
		if (timeline != null && timeline.equalsIgnoreCase("me")) {
			return linkedIn.profileOperations().getUserProfile();
		} else
			return null;
	}
}
