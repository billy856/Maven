package com.clps.user.model;

/**
 * Created by jinyulei on 16/8/25.
 */
public class User {
    private String userName;

    public User() {

    }

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }


}
