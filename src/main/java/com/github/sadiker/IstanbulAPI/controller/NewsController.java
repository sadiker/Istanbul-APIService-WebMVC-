package com.github.sadiker.IstanbulAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;



import com.github.sadiker.IstanbulAPI.service.NewsService;


@Controller
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/news")
    public String getNews(ModelMap map) {
        map.addAttribute("listNews",newsService.getNews());
        return "news/getNews";

    }

}
