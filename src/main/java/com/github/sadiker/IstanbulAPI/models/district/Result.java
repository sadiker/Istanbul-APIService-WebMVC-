package com.github.sadiker.IstanbulAPI.models.district;

import java.util.List;

public class Result  {

    private boolean code ;
    private String message;
    private List<District> districts;

    public Result(boolean code, String message, List<District> districts) {
        this.code = code;
        this.message = message;
        this.districts = districts;
    }

    public boolean isCode() {
        return code;
    }

    public void setCode(boolean code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    

    

}
