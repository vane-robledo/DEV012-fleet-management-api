package com.fleetmanagment.api;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LastLocationRepository extends JpaRepository<Trajectories, Integer> {
        @Query("SELECT DISTINCT t.taxi_id, t.date, t.longitude, t.latitude FROM Trajectories t " +
                "WHERE (t.taxi_id, t.date) IN "
        + "(SELECT t2.taxi_id, MAX(t2.date) FROM Trajectories t2 GROUP BY t2.taxi_id)")

        List<Object[]> findLastLocationForAllTaxis(Pageable pageable);


}
