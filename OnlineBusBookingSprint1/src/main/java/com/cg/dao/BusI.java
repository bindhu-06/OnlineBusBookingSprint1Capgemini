package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Bus;

@Repository
public interface BusI extends JpaRepository<Bus, Integer> {

}
