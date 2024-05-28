package com.antonycafisso.springbootmongodb.dto;

import com.antonycafisso.springbootmongodb.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String Email;

    public UserDTO() {
    }

    public UserDTO(User user){
        id = user.getId();
        name = user.getName();
        Email = user.getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
