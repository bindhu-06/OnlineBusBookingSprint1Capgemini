package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.entities.BusRoute;


@Repository
public interface BusRouteI extends JpaRepository<BusRoute, Integer> {

}
