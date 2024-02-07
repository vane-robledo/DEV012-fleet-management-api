package com.fleetmanagment.api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class LastLocationService {
    @Autowired
    private LastLocationRepository lastLocationRepository;

    public List<Trajectories> getLastLocation(int taxiId) {
        return lastLocationRepository.findLastLocationByTaxiId(taxiId);
    }
}