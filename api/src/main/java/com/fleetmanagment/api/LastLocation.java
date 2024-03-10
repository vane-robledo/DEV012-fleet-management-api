package com.fleetmanagment.api;

import java.sql.Timestamp;

public class LastLocation {
        private int taxi_id;
        private Timestamp date;
        private double latitude;
        private double longitude;

    public LastLocation(int taxi_id, Timestamp date, double latitude, double longitude) {
        this.taxi_id = taxi_id;
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Timestamp getDate() {
        return date;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setTaxi_id(int taxi_idd) {
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getTaxi_id() {
        return taxi_id;
    }
    }

