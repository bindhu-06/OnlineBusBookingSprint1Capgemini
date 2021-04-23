package com.cg.dao;

import com.cg.entities.BusOperator;
//import com.cg.entities.Booking;
import com.cg.entities.Bus;

import java.util.List;

//import com.cg.exceptions.InvalidUsernameException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BusOperatorI extends JpaRepository<BusOperator, Integer> {

//public void addBus(Bus bus);	
	//public BusOperator singIn(BusOperator busoperator);
	//public BusOperator singOut(BusOperator busoperator);
	
	//public void addBusOperator(BusOperator busoperator);
	

}
