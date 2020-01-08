package com.revature.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer{

	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**")
	            .allowedOrigins("http://localhost:1234", "http://localhost:3000", "http://mutamon.s3-website-us-east-1.amazonaws.com")
	            .allowedMethods("PUT", "DELETE", "GET", "OPTIONS", "POST", "PATCH")
	            .allowedHeaders("header1", "Content-Type", "Authorization")
	            .allowCredentials(true);
		}
	
}
