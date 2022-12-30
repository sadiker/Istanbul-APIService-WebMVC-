package com.github.sadiker.IstanbulAPI.models.gasoline;

import java.util.List;

public class ReplyGasoline {
    
    private boolean success;
    
    private List<Gasoline> result ;

    
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public List<Gasoline> getResult() {
        return result;
    }
    public void setResult(List<Gasoline> result) {
        this.result = result;
    }

    

}
