package com.antonycafisso.springbootmongodb.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.antonycafisso.springbootmongodb.domain.Post;

public class PostDTO {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String id;
    private Date date;
    private String title;
    private String body;

    public PostDTO(){

    }

    public PostDTO(Post post){
        this.id = post.getId();
        this.date = post.getDate();
        this.title = post.getTitle();
        this.body = post.getBody();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    
}
