package com.fleetmanagment.api;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
@Entity
public class Trajectories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public void setTaxiId(int taxiId) {
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
