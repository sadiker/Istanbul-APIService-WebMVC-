package com.github.sadiker.IstanbulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import com.github.sadiker.IstanbulAPI.service.WeatherService;


@Controller
public class WeatherController {
    
   @Autowired
   WeatherService weatherService;

    @GetMapping(path = {"/weathers"})
    public String index(ModelMap map){
        map.addAttribute("weather",weatherService.getWeathers() );
        return "weathers/getWeathers";
    }
    
}
