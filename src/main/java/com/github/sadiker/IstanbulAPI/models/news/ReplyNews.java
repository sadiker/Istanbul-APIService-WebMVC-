package com.github.sadiker.IstanbulAPI.models.news;

import java.util.List;

public class ReplyNews {

    private boolean success ;
    private List<News> result ;

    
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public List<News> getResult() {
        return result;
    }
    public void setResult(List<News> result) {
        this.result = result;
    }

    
    
}
