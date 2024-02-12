package com.fleetmanagment.api;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
public class Trajectories {
    @Id
    private int id;
    private int taxi_id;
    private Timestamp date;
    private double latitude;
    private double longitude;

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
        this.taxi_id = taxi_id;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getTaxi_id() {
        return taxi_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
