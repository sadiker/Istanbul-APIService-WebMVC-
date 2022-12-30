package com.github.sadiker.IstanbulAPI.models.pray;

public class TimeToPray {

    private String time;
    private String hour;
    private String min;
    
    public TimeToPray() {
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getHour() {
        return hour;
    }
    public void setHour(String hour) {
        this.hour = hour;
    }
    public String getMin() {
        return min;
    }
    public void setMin(String min) {
        this.min = min;
    }
    @Override
    public String toString() {
        return "TimeToPray [time=" + time + ", hour=" + hour + ", min=" + min + "]";
    }

    


    
}
