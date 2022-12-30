package com.github.sadiker.IstanbulAPI.models.weather;

public class Weather {
    
    private String date;
    private String day;
    private String icon;
    private String description;
    private String status;
    private String degree;
    private String min;
    private String max;
    private String night;
    private String humidity;


    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getMin() {
        return min;
    }
    public void setMin(String min) {
        this.min = min;
    }
    public String getMax() {
        return max;
    }
    public void setMax(String max) {
        this.max = max;
    }
    public String getNight() {
        return night;
    }
    public void setNight(String night) {
        this.night = night;
    }
    public String getHumidity() {
        return humidity;
    }
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
    @Override
    public String toString() {
        return "Weather [date=" + date + ", day=" + day + ", description=" + description + ", degree=" + degree + "]";
    }
    
}
