package com.example.myapplication;

public class Field {

    private long field_id;
    private String field_size;

    // constructeur
    public Field(long field_id, String field_size) {
        super();
        this.field_id = field_id;
        this.field_size = field_size;

    }

    public long getField_id() {
        return field_id;
    }

    public void setField_id(long field_id) {
        this.field_id = field_id;
    }

    public String getField_size() {
        return field_size;
    }

    public void setField_size(String field_size) {
        this.field_size = field_size;
    }



}
