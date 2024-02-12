package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class TrajectoriesController {
    @Autowired
    private TrajectoriesService trajectoriesService;


    @GetMapping("/trajectories")
    public Page<Trajectories> getTrajectoriesByTaxiId(
            @RequestParam int taxiId,
            @RequestParam  String date,
            @PageableDefault(page = 0, size = 20) Pageable pageable
    ) {
        return trajectoriesService.getTrajectoriesByTaxiId(taxiId,date, pageable);
    }
}
