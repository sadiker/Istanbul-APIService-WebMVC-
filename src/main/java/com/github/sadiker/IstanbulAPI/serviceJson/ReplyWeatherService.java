package com.github.sadiker.IstanbulAPI.serviceJson;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
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

    @Autowired
    HttpHeaders httpHeaders;

    public ReplyWeathers getWeather() {

        httpHeaders.set("authorization", Config.getApiKey());
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        @SuppressWarnings({ "rawtypes", "unchecked" })
        HttpEntity httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity<ReplyWeathers> responseEntity = restTemplate.exchange(
                URL,
                HttpMethod.GET,
                httpEntity,
                ReplyWeathers.class);

        return responseEntity.getBody();

    }

}
