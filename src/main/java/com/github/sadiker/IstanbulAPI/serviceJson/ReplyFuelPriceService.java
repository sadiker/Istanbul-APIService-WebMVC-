package com.github.sadiker.IstanbulAPI.serviceJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.sadiker.IstanbulAPI.configuration.Config;
import com.github.sadiker.IstanbulAPI.models.diesel.ReplyDiesel;
import com.github.sadiker.IstanbulAPI.models.gasoline.ReplyGasoline;

@Service
public class ReplyFuelPriceService  {

    private static final String URL_GASOLİNE_EUROPE = "https://api.collectapi.com/gasPrice/turkeyGasoline?district=bakirkoy&city=istanbul";
    private static final String URL_GASOLİNE_ASİA = "https://api.collectapi.com/gasPrice/turkeyGasoline?district=kadikoy&city=istanbul";

    private static final String URL_DİESEL_ASİA = "https://api.collectapi.com/gasPrice/turkeyDiesel?district=kadikoy&city=istanbul";
    private static final String URL_DİESEL_EUROPE = "https://api.collectapi.com/gasPrice/turkeyDiesel?district=bakirkoy&city=istanbul";

    private static final String URL_LPG = "https://api.collectapi.com/gasPrice/turkeyLpg?city=istanbul";

    @Autowired
    RestTemplate restTemplate;

    public ReplyGasoline getGasoline(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", Config.getApiKey());
        headers.set("content-type", "application/json");
        HttpEntity<ReplyGasoline> httpEntity = new HttpEntity<ReplyGasoline>(headers);

        ResponseEntity<ReplyGasoline> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                ReplyGasoline.class);

        return responseEntity.getBody();
    }

    public ReplyDiesel getDiesel(String url) {

        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", Config.getApiKey());
        headers.set("content-type", "application/json");
        HttpEntity<ReplyDiesel> httpEntity = new HttpEntity<ReplyDiesel>(headers);

        ResponseEntity<ReplyDiesel> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                ReplyDiesel.class);

        return responseEntity.getBody();

    }

    public static String getUrlGasolineEurope() {
        return URL_GASOLİNE_EUROPE;
    }

    public static String getUrlGasolineAsia() {
        return URL_GASOLİNE_ASİA;
    }

    public static String getUrlDieselAsia() {
        return URL_DİESEL_ASİA;
    }

    public static String getUrlDieselEurope() {
        return URL_DİESEL_EUROPE;
    }

    public static String getUrlLpg() {
        return URL_LPG;
    }

    

}
