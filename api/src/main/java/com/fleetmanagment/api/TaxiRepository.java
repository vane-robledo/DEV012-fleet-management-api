package com.fleetmanagment.api;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.List;


@Repository
public interface TaxiRepository extends JpaRepository<Taxis, Long> {
     Page<Taxis> findAll(Pageable pageable);
}



