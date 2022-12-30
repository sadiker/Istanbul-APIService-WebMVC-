package com.github.sadiker.IstanbulAPI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	private static final String API_KEY = "Buraya CollectAPI sitesinden aldığınız apikey'i yazacaksınız...";

	public static String getApiKey() {
		return API_KEY;
	}
	
    @Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}


	

    
    
}
