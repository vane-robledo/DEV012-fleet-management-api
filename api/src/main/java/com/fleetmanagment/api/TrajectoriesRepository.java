package com.fleetmanagment.api;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrajectoriesRepository extends JpaRepository<Trajectories, Integer> {
    List<Trajectories> findByTaxiId(int taxiId, Pageable pageable);

}
