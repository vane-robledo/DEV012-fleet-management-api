package com.fleetmanagment.api;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LastLocationRepository extends JpaRepository<Trajectories, Integer> {
        @Query(value = "SELECT * FROM trajectories t WHERE taxi_id = ?1 ORDER BY t.date DESC LIMIT 1", nativeQuery = true)
        List <Trajectories> findLastLocationByTaxiId(int taxiId);
}
