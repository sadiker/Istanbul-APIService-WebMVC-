package com.github.sadiker.IstanbulAPI.serviceJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.sadiker.IstanbulAPI.configuration.Config;
import com.github.sadiker.IstanbulAPI.models.weather.ReplyWeathers;

@Service
public class ReplyWeatherService {

    private static final String URL = "https://api.collectapi.com/weather/getWeather?data.lang=tr&data.city=istanbul";

    @Autowired
    private RestTemplate restTemplate;

    public ReplyWeathers getWeather() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", Config.getApiKey());
        headers.set("content-type", "application/json");
        HttpEntity<ReplyWeathers> entityReq = new HttpEntity<ReplyWeathers>(headers);

        ResponseEntity<ReplyWeathers> responseEntity = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                entityReq,
                ReplyWeathers.class);

        System.out.println(responseEntity.getStatusCode());
        System.out.println(responseEntity.getBody());
        return responseEntity.getBody();

    }

}
