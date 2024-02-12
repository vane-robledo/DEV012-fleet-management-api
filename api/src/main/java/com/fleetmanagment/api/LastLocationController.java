package com.fleetmanagment.api;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("/api")
public class LastLocationController {
    private final LastLocationService lastLocationService;

    public LastLocationController(LastLocationService lastLocationService) {
        this.lastLocationService = lastLocationService;
    }


    @GetMapping("/lastLocation")
    public List<Object[]> getLastLocation(Pageable pageable){
        return lastLocationService.getLastLocation(pageable);
    }
}