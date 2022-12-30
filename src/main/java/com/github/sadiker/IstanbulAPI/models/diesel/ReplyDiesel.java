package com.github.sadiker.IstanbulAPI.models.diesel;

import java.util.List;

public class ReplyDiesel {

    private boolean success;
    private List<Diesel> result ;
    
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public List<Diesel> getResult() {
        return result;
    }
    public void setResult(List<Diesel> result) {
        this.result = result;
    }

    
    
}
