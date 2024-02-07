package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LastLocationController {
    private final LastLocationService lastLocationService;

    public LastLocationController(LastLocationService lastLocationService) {
        this.lastLocationService = lastLocationService;
    }


    @GetMapping("/lastLocation")
    public List<Trajectories> getLastLocation(
            @RequestParam int taxiId){
        return lastLocationService.getLastLocation(taxiId);
    }
}