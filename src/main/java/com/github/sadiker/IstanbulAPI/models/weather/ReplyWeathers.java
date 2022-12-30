package com.github.sadiker.IstanbulAPI.models.weather;

import java.util.List;

public class ReplyWeathers {
   
    private List<Weather>  result;

    public List<Weather> getResult() {
        return result;
    }

    public void setResult(List<Weather> result) {
        this.result = result;
    }
    
}
