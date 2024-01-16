package com.example.app_english;

public class HelperClass {
    String name, date, username, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HelperClass(String name, String date, String username, String password) {
        this.name = name;
        this.date = date;
        this.username = username;
        this.password = password;
    }

    public HelperClass() {
    }
}
