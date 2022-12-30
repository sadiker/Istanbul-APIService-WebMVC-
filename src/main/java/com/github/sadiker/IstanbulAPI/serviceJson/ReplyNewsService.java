package com.github.sadiker.IstanbulAPI.serviceJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.sadiker.IstanbulAPI.configuration.Config;
import com.github.sadiker.IstanbulAPI.models.news.ReplyNews;

@Service
public class ReplyNewsService {

    private static final String URL_NEWS = "https://api.collectapi.com/news/getNews?country=tr&tag=general";

    @Autowired
    RestTemplate restTemplate;

    public ReplyNews getLocalNews() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", Config.getApiKey());
        headers.set("content-type", "application/json");
        HttpEntity<ReplyNews> httpEntity = new HttpEntity<ReplyNews>(headers);

        ResponseEntity<ReplyNews> responseEntity = restTemplate.exchange(
                URL_NEWS,
                HttpMethod.GET,
                httpEntity,
                ReplyNews.class);

        return responseEntity.getBody();
    }

}
