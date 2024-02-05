package com.fleetmanagment.api;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TrajectoriesService {
    @Autowired
    private TrajectoriesRepository trajectoriesRepository;


    public List<Trajectories> getTrajectoriesByTaxiId(int taxiId, Pageable pageable) {
        return trajectoriesRepository.findByTaxiId(taxiId,pageable);
    }
}

