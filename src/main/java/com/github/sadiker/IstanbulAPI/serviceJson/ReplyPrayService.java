package com.github.sadiker.IstanbulAPI.serviceJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.sadiker.IstanbulAPI.configuration.Config;
import com.github.sadiker.IstanbulAPI.models.pray.ReplyPray;
import com.github.sadiker.IstanbulAPI.models.pray.ReplyTimeToPray;

@Service
public class ReplyPrayService {

    private final String URL_PRAY_ALL = "https://api.collectapi.com/pray/all?data.city=istanbul";
    private final String URL_PRAY_SİNGLE = "https://api.collectapi.com/pray/single?ezan=";
    
    @Autowired
    RestTemplate restTemplate;

    public ReplyPray getPrayAll() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", Config.getApiKey());
        headers.set("content-type", "application/json");
        HttpEntity<ReplyPray> entityReq = new HttpEntity<ReplyPray>(headers);

        ResponseEntity<ReplyPray> responseEntity = restTemplate.exchange(
                URL_PRAY_ALL,
                HttpMethod.GET,
                entityReq,
                ReplyPray.class);

        return responseEntity.getBody();

    }

    public ReplyTimeToPray getTimeToPray(String vakit) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", Config.getApiKey());
        headers.set("content-type", "application/json");
        HttpEntity<ReplyTimeToPray> entityReq = new HttpEntity<ReplyTimeToPray>(headers);

        ResponseEntity<ReplyTimeToPray> responseEntity = restTemplate.exchange(
                URL_PRAY_SİNGLE +vakit+ "&data.city=istanbul",
                HttpMethod.GET,
                entityReq,
                ReplyTimeToPray.class);

        
        System.out.println(responseEntity.getBody().getResult().get(0));

        return responseEntity.getBody();
    }

}
