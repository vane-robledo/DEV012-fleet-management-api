package com.fleetmanagment.api;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;


@Entity
public class Trajectories {
    @Id
    private int id;
    private int taxiId;
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

    public void setTaxi_id(int taxiId) {
        this.taxiId = taxiId;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
