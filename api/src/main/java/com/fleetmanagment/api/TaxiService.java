package com.fleetmanagment.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TaxiService {
    @Autowired
    private TaxiRepository taxiRepository;

    public Page<Taxis> getAllTaxis(Pageable pageable) {
        return  taxiRepository.findAll(pageable);
    }
}





