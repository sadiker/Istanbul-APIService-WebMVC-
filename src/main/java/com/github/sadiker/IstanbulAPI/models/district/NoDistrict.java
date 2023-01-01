package com.github.sadiker.IstanbulAPI.models.district;


public class NoDistrict implements ReplyDistrict {

    private String message;

    public NoDistrict(String message) {
        this.message = message;
    }

    // public NoDistrict() {
    // }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
