package com.github.sadiker.IstanbulAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sadiker.IstanbulAPI.models.weather.Weather;
import com.github.sadiker.IstanbulAPI.serviceJson.ReplyWeatherService;
@Service
public class WeatherService {

    @Autowired
    ReplyWeatherService replyWeatherService;

    public List<Weather> getWeathers() {
        return replyWeatherService.getWeather().getResult();
    }
    
}
