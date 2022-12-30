package com.github.sadiker.IstanbulAPI.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.sadiker.IstanbulAPI.service.FuelPriceService;

@Controller
public class FuelPriceController {
    
    @Autowired
    FuelPriceService fuelPriceService;

    @GetMapping("/fuelPrice")
    public String getFuelPrice(ModelMap map){
     map.addAttribute("listGasolineEurope",  fuelPriceService.getGasolineEurope());
     
     map.addAttribute("listGasolineAsia", fuelPriceService.getGasolineAsia());

     map.addAttribute("listDieselEurope", fuelPriceService.getDieselEurope());

     map.addAttribute("listDieselAsia", fuelPriceService.getDieselAsia());
        return "fuelPrice/fuelPrice";
        
    }
}
