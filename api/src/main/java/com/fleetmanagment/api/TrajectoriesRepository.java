package com.fleetmanagment.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrajectoriesRepository extends JpaRepository<Trajectories, Integer> {
    @Query(value = "SELECT * FROM trajectories t WHERE taxi_id = :taxiId AND TO_CHAR(date, 'yyyy-MM-dd') = :date", nativeQuery = true)
    Page<Trajectories> findByTaxiId(int taxiId, String date, Pageable pageable);

}
