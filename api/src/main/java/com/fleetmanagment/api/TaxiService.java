package com.fleetmanagment.api;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TaxiService {
    @Autowired
    private TaxiRepository taxiRepository;

    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public List<Taxis> getAllTaxis() {
        return taxiRepository.findAll();
    }
}




