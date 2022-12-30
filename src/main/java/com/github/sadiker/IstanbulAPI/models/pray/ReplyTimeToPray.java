package com.github.sadiker.IstanbulAPI.models.pray;

import java.util.List;

public class ReplyTimeToPray  {

    private boolean success;
    private List<TimeToPray> result;

    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public List<TimeToPray> getResult() {
        return result;
    }
    public void setResult(List<TimeToPray> result) {
        this.result = result;
    }

    
    
}
