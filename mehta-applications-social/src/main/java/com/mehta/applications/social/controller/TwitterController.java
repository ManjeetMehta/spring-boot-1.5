package com.mehta.applications.social.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mehta.applications.common.constants.ApplicationConstants;

@RestController
@RequestMapping(value = ApplicationConstants.TWITTER_BASE_URL)
public class TwitterController<modelAndView> {

	@Autowired
	private Twitter twitter;
	
	
	@RequestMapping(value = ApplicationConstants.OPERATION_TWITTER_SEARCH, method= RequestMethod.GET)
	public List<Tweet> getSearchedTweet(@PathVariable final String hashTag){
		return twitter.searchOperations().search(hashTag,10).getTweets();
	}

	@RequestMapping(value = ApplicationConstants.OPERATION_TWITTER_TIMELINE, method= RequestMethod.GET)
	public List<Tweet> getTimeLine(@PathVariable final String timeline){
		return twitter.timelineOperations().getUserTimeline(timeline);
	}
	
}
