package com.api.restfulpoc.model;

public class Example {
    private String title;
    private String platform;
    private String genre;    
    
    public Example() {
    }
    public Example(String title, String platform, String genre) {
        this.title = title;
        this.platform = platform;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
