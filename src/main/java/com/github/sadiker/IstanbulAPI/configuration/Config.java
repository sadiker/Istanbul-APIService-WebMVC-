package com.github.sadiker.IstanbulAPI.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.github.sadiker.IstanbulAPI.models.district.NoDistrict;

@Configuration
public class Config {

	private static final String API_KEY = "Buraya CollectAPI sitesinden aldığınız apikey'i yazacaksınız...";

	public static String getApiKey() {
		return API_KEY;
	}
	@Bean
	NoDistrict noDistrict(){
		return new NoDistrict("O id'de veya isimde ilçe yoktur...");
	}
    @Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}


	

    
    
}
