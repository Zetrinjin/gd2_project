package project.data.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class UserDto {


    private String id;


    private String userName;


    private String userSecondName;


    private String mail;


    private String password;

    public UserDto() {
    }

    public UserDto(String id, String userName, String userSecondName, String mail, String password) {
        this.id = id;
        this.userName = userName;
        this.userSecondName = userSecondName;
        this.mail = mail;
        this.password = password;
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

    public String getUserSecondName() {
        return userSecondName;
    }

    public void setUserSecondName(String userSecondName) {
        this.userSecondName = userSecondName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
