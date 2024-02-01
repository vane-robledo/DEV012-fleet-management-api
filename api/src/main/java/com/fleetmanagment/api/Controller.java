package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private TaxiService taxiService;
    @Autowired
    private TrajectoriesService trajectoriesService;

    @GetMapping("/taxis")
    public ResponseEntity<List<Taxis>> getAllTaxis() {
        List<Taxis> taxis = taxiService.getAllTaxis();
        return new ResponseEntity<>(taxis, HttpStatus.OK);
    }
    @GetMapping("/trajectories")
    public ResponseEntity<List<Trajectories>> getAllTrajectories() {
        List<Trajectories> trajectories = trajectoriesService.getAllTaxis();
        return new ResponseEntity<>(trajectories, HttpStatus.OK);
    }
}


