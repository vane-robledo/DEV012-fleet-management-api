package com.fleetmanagment.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface TrajectoriesRepository extends JpaRepository<Trajectories, Long> {

}
