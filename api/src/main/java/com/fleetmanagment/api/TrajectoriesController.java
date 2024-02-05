package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TrajectoriesController {
    @Autowired
    private TrajectoriesService trajectoriesService;


    @GetMapping("/trajectories")
    public List<Trajectories> getTrajectoriesByTaxiId(
            @PathVariable int taxiId,
            @PageableDefault(page = 0, size = 20) Pageable pageable
    ) {
        return trajectoriesService.getTrajectoriesByTaxiId(taxiId, pageable);
    }
}
