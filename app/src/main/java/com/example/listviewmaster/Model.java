package com.example.listviewmaster;

public class Model {

    private String no;
    private String name;
    private String login;


    public Model(String cNo, String cName, String cLogin) {
        this.no = cNo;
        this.name = cName;
        this.login = cLogin;

    }

    public String getsNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }




}