package com.fleetmanagment.api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@Service
public class TrajectoriesService {
    @Autowired
    private TrajectoriesRepository trajectoriesRepository;


    public Page<Trajectories> getTrajectoriesByTaxiId(int taxiId, String date, Pageable pageable) {
        return trajectoriesRepository.findByTaxiId(taxiId, date, pageable);
    }
}

