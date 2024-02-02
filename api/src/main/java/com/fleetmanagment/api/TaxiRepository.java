package com.fleetmanagment.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;


@Repository
public interface TaxiRepository extends JpaRepository<Taxis, Long> {

}



