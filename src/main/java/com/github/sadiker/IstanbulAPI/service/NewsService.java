package com.github.sadiker.IstanbulAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.sadiker.IstanbulAPI.models.news.News;
import com.github.sadiker.IstanbulAPI.serviceJson.ReplyNewsService;

@Service
public class NewsService {

    @Autowired
    ReplyNewsService replyNewsService;

    public List<News> getNews() {
        return replyNewsService.getLocalNews().getResult();
    }
    
}
