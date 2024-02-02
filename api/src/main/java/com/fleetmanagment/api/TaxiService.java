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

    public TaxiService(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public List<Taxis> getAllTaxis(Pageable pageable) {
        Page<Taxis> page = taxiRepository.findAll(pageable);
        return page.getContent();
    }
}





