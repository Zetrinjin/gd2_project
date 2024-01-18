package project.data.model;

import jakarta.persistence.*;
import project.data.pojo.Account;
import project.data.pojo.Credit;

import java.util.List;


public class UserDto {


    private String id;


    private String userName;


    private String name;


    private String password;


    private String role;



    public UserDto() {
    }


    public UserDto(String id, String userName, String name, String password, String role) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
