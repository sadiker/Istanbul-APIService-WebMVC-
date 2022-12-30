package com.github.sadiker.IstanbulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.sadiker.IstanbulAPI.service.PrayService;

@Controller
public class PrayController {
    
    @Autowired
    PrayService  prayService;

    @GetMapping("/getPrayTime") 
    public String getPray(ModelMap map) {

        map.addAttribute("prayTimeAll",prayService.getPrayAll());
        map.addAttribute("timeToPray", prayService.getTimeToPrayAll());
       
        return "pray/pray";
    }


    
}
