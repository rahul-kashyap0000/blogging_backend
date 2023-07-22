package com.intuit.authoring_tool.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "articles")
public class Article {
    private int id;
    private String title;
    private String content;
    private String content_type;
    private String authorName;
    // This is of type String right now, abhi baad mein isko DateTime pe karunga, because actually to Datetime hi hona chahiye
    private String dateCreated;

    public Article(int id, String title, String content, String content_type, String authorName, String dateCreated) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.content_type = content_type;
        this.authorName = authorName;
        this.dateCreated = dateCreated;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
