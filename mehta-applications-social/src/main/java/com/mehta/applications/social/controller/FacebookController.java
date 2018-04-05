package com.mehta.applications.social.controller;

import java.util.List;

import org.springframework.social.connect.Connection;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.oauth2.AccessGrant;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.oauth2.OAuth2Parameters;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FacebookController<modelAndView> {

	private FacebookConnectionFactory factory = new FacebookConnectionFactory("1405309989574916",
			"af3fca607ba52d451d992ff9266c5d5b");

	@RequestMapping("facebook/facebook.html")
	public String startFacebookProcess() {
		OAuth2Operations operations = factory.getOAuthOperations();
		OAuth2Parameters params = new OAuth2Parameters();

		params.setRedirectUri("http://localhost:8082/crm/facebook/returnFromFacebook.html");
		params.setScope("email, public_profile, user_friends, user_post");

		String url = operations.buildAuthorizeUrl(params);
		System.out.println("url is : " + url);
		return "redirect" + url;
	}

	@RequestMapping("facebook/returnFromFacebook.html")
	public modelAndView getDataFromFacebook(@RequestParam("code") String authorizationCode) {
		OAuth2Operations operations = factory.getOAuthOperations();
		AccessGrant accessGrant = operations.exchangeForAccess(authorizationCode,
				"http://localhost:8082/crm/facebook/returnFromFacebook.html", null);

		Connection<Facebook> connection = factory.createConnection(accessGrant);
		String email = connection.fetchUserProfile().getEmail();
		String name = connection.getDisplayName();
		String username = connection.fetchUserProfile().getUsername();

		System.out.println("\n\nEmail" + email);
		System.out.println("\n\nName" + username);
		System.out.println("\n\ndisplay name" + name);

		Facebook facebook = connection.getApi();
		List<Post> posts = facebook.feedOperations().getFeed();

		System.out.println("\n\n\n Messages");
		for (Post post : posts) {
			System.out.println(post.getMessage());
		}

		return null;
	}
}
