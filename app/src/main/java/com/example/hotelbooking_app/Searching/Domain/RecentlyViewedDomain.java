package com.example.hotelbooking_app.Searching.Domain;

import java.io.Serializable;

public class RecentlyViewedDomain implements Serializable {
    private String name;
    private String address;
    private double rating;
    private int ratingCount;

    public RecentlyViewedDomain(String name, String address, double rating, int ratingCount) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.ratingCount = ratingCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
}
