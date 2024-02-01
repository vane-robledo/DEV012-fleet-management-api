package com.fleetmanagment.api;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TrajectoriesService {
    @Autowired
    private TrajectoriesRepository trajectoriesRepository;


    public List<Trajectories> getAllTaxis() {
        return trajectoriesRepository.findAll();
    }
}