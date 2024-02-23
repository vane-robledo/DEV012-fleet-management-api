package com.fleetmanagment.api;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class LastLocationService {
    @Autowired
    private LastLocationRepository lastLocationRepository;

    public List<LastLocation> getLastLocation(Pageable pageable) {
        return lastLocationRepository.findLastLocationForAllTaxis(pageable);
    }
}