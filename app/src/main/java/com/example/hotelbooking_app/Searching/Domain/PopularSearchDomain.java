package com.example.hotelbooking_app.Searching.Domain;

import java.io.Serializable;

public class PopularSearchDomain {
    private String name;
    private int count;
    private int picUrl;

    public PopularSearchDomain(String name, int count, int picUrl) {
        this.name = name;
        this.count = count;
        this.picUrl = picUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(int picUrl) {
        this.picUrl = picUrl;
    }
}
