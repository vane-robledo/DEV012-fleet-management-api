package com.fleetmanagment.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TaxiController {
    @Autowired
    private TaxiService taxiService;

    @GetMapping("/taxis")
    public Page<Taxis> getAllTaxis(@PageableDefault(page = 0, size = 20) Pageable pageable) {
        return taxiService.getAllTaxis(pageable);
    }


}


