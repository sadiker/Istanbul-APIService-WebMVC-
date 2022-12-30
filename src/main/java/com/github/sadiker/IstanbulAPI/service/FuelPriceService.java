package com.github.sadiker.IstanbulAPI.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sadiker.IstanbulAPI.models.diesel.Diesel;
import com.github.sadiker.IstanbulAPI.models.gasoline.Gasoline;
import com.github.sadiker.IstanbulAPI.serviceJson.ReplyFuelPriceService;

@Service
public class FuelPriceService  {

    @Autowired
    ReplyFuelPriceService replyFuelPriceService;

    public List<Gasoline> getGasolineEurope() {
        return replyFuelPriceService.getGasoline(ReplyFuelPriceService.getUrlGasolineEurope()).getResult();
    }

   
    public List<Gasoline> getGasolineAsia() {
        return replyFuelPriceService.getGasoline(ReplyFuelPriceService.getUrlGasolineAsia()).getResult();
    }

    public List<Diesel> getDieselEurope() {
        return replyFuelPriceService.getDiesel(ReplyFuelPriceService.getUrlDieselEurope()).getResult();
    }

   
    public List<Diesel> getDieselAsia() {
        return replyFuelPriceService.getDiesel(ReplyFuelPriceService.getUrlDieselAsia()).getResult();
    }

    



    

}
