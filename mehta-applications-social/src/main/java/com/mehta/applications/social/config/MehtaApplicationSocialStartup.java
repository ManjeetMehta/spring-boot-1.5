package com.mehta.applications.social.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan (basePackages={"com.mehta.applications"})
public class MehtaApplicationSocialStartup {
	
	public static void main(String[] args) {
		SpringApplication.run(MehtaApplicationSocialStartup.class, args);
	}
	
}
