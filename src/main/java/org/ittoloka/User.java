package org.ittoloka;

import org.springframework.context.annotation.Bean;

/**
 * Created by SeVlad on 09.09.2016.
 */

public class User {
    private String username;
    private int userID;
    private String email;
    public User() {
        userID = -1;
        username = "";
        email = "";
    }

    public User(String username, int userID, String email) {
        this.username = username;
        this.userID = userID;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", userID=" + userID +
                ", email='" + email + '\'' +
                '}';
    }
}
