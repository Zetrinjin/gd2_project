package project.data.model;

import jakarta.persistence.Column;

public class NewsDto {
    private int id;


    private String title;


    private String  headline;

    public NewsDto() {
    }

    public NewsDto(int id, String title, String headline) {
        this.id = id;
        this.title = title;
        this.headline = headline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
