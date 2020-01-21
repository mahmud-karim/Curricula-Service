package com.revature.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("http://localhost:1910/vis", "http://localhost:3000/vis", "http://localhost:3000")
	            .allowedMethods("PUT", "DELETE", "GET", "OPTIONS", "POST", "PATCH")
	            .allowedHeaders("header1", "Content-Type", "Authorization")
	            .allowCredentials(true);
		}	
}