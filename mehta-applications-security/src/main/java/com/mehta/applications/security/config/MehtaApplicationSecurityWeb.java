package com.mehta.applications.security.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan (basePackages={"com.mehta.applications.security"})
@EnableJpaRepositories(basePackages={"com.mehta.applications.security.repository"})
@EntityScan(basePackages={"com.mehta.applications.security.model"})
public class MehtaApplicationSecurityWeb {
	
	public static void main(String[] args) {
		SpringApplication.run(MehtaApplicationSecurityWeb.class, args);
	}

}
