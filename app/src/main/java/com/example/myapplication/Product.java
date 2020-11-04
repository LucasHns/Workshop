package com.example.myapplication;

public class Product {

    private long product_id;
    private String product_name;
    private String product_type;

    // constructeur
    public Product(long product_id, String product_name, String product_type) {
        super();
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_type = product_type;

    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }


}
