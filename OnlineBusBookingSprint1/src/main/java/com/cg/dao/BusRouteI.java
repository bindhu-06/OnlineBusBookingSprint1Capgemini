package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.BusRoute;

public interface BusRouteI extends JpaRepository<BusRoute, Integer> {

}
