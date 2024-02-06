package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TrajectoriesController {
    @Autowired
    private TrajectoriesService trajectoriesService;


    @GetMapping("/trajectories")
    public List<Trajectories> getTrajectoriesByTaxiId(
            @RequestParam int taxiId,
            @RequestParam  String date,
            @PageableDefault(page = 0, size = 20) Pageable pageable
    ) {
        System.out.println(date);
        return trajectoriesService.getTrajectoriesByTaxiId(taxiId,date, pageable);
    }
}
