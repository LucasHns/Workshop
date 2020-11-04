package com.example.myapplication;

public class Tools {

    private long tools_id;
    private String tools_name;

    // constructeur
    public Tools(long tools_id, String tools_name) {
        super();
        this.tools_id = tools_id;
        this.tools_name = tools_name;

    }

    public long getTools_id() {
        return tools_id;
    }

    public void setTools_id(long tools_id) {
        this.tools_id = tools_id;
    }

    public String getTools_name() {
        return tools_name;
    }

    public void setTools_name(String tools_name) {
        this.tools_name = tools_name;
    }


}
