package com.mehta.applications.social.controller;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mehta.applications.common.constants.ApplicationConstants;

@Controller
@RequestMapping(value=ApplicationConstants.OPERATION_SOCIAL_FACEBOOK)
public class FacebookConnectController {


    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public FacebookConnectController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping
    @RequestMapping
    public String helloFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        PagedList<Post> feed = facebook.feedOperations().getFeed();
        model.addAttribute("feed", feed);
        return "hello";
    }

    @GetMapping
    @RequestMapping(value="/error")
	public String errorFacebook() {
		return "redirect:/error.html";
	}

}
