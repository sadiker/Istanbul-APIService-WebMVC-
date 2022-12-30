package com.github.sadiker.IstanbulAPI.models.pray;

import java.util.List;

public class ReplyPray  {

    private boolean success;
    private List<Pray> result;


    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public List<Pray> getResult() {
        return result;
    }
    public void setResult(List<Pray> result) {
        this.result = result;
    }

    
    
}
