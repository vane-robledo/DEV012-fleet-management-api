package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taxis")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;

    @GetMapping
    public ResponseEntity<List<Taxis>> getAllTaxis() {
        List<Taxis> taxis = taxiService.getAllTaxis();
        return new ResponseEntity<>(taxis, HttpStatus.OK);
    }
}


