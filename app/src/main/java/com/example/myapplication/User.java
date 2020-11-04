package com.example.myapplication;

public class User {

    private long user_id;
    private String name;
    private String forname;
    private String login;
    private String password;

    // constructeur
    public User(long user_id, String name, String forname,String login,String password) {
        super();
        this.user_id = user_id;
        this.name = name;
        this.forname = forname;
        this.login = login;
        this.password = password;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
