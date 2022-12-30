package com.github.sadiker.IstanbulAPI.models.news;

public class News {
    
    private String key;
    private String url;
    private String description;
    private String image;
    private String name;
    private String source;


    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    @Override
    public String toString() {
        return "News [key=" + key + ", url=" + url + ", description=" + description + ", image=" + image + ", name="
                + name + ", source=" + source + "]";
    }

    

    
}
