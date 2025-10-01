package com.countingTree.Counting.Tree.App.model;

import jakarta.persistence.*;

@Embeddable
public class Coordinate {
    
    private double latitude;
    private double longitude;

    // -------------------------------------------------------- CONSTRUCTORS, GETTERS AND SETTERS
    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordinate() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}
