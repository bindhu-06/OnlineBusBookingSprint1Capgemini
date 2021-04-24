package com.cg.service;

import java.time.LocalDate;

import java.util.List;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.cg.dao.BusI;
import com.cg.dao.BusOperatorI;
import com.cg.dao.BusOperatorRequestI;
import com.cg.dao.BusRouteI;
import com.cg.dto.BusDto;
import com.cg.dto.BusOperatorDto;
import com.cg.dto.BusRouteDto;
import com.cg.entities.Booking;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
import com.cg.entities.BusOperatorRequest;
import com.cg.entities.BusRoute;
import com.cg.exception.InvalidUsernameException;
@Service
public class BusOperatorServiceImpl implements IBusOperatorService {

	@Autowired
	BusOperatorI busoperatori;
	@Autowired
	BusI busi;
	
	@Autowired
	BusRouteI busroutei;
	
	
	@Override
	public  BusOperator addBusOperator(BusOperatorDto busoperatordto) {
		BusOperator busoperator=new BusOperator();
		busoperator.setBusOperatorUsername(busoperatordto.getUserId());
		busoperator.setPassword(busoperatordto.getPassword());
		return busoperatori.save(busoperator);
		

	}

	
	
		

	public List<Booking> getRevenueByBusRoute(String routeName) {
	
		return busoperatori.findRevenueByBusRouteRouteName(routeName);
	}


	@Override
	public List<Booking> getMonthlyRevenueByBusRoute(String routeName, int month) {
		
		return busoperatori.findMonthlyRevenueByBusRouteRouteName(routeName,month);
	}


	@Override
	public List<Booking> getRevenueByBusRouteAndDate(String routeName, LocalDate date) {
	
		return busoperatori.getRevenueByBusRouteAndDate(routeName, date);
	}


	@Override
	public List<Booking> getYearlyRevenueByBusRoute(String routeName, int year) {
		
		return busoperatori.getYearlyRevenueByBusRoute(routeName, year);
	}




	@Override
	public void addBus(BusDto busdto) {
		Bus bus=new Bus();
		BusRoute busroute = busroutei.findById(busdto.getBusRouteId()).get();
		bus.setBusNumber(busdto.getBusNumber());
	    bus.setFare(busdto.getFare());
	    bus.setTotalSeats(busdto.getTotalSeats());
	    bus.setBusRoute(busroute);
	    busi.save(bus);
	    
		
	}
@Override
public void  addBusRoute(BusRouteDto busroutedto)
 {
	BusRoute busroute=new BusRoute();
	busroute.setDestination(busroutedto.getDestination());
	busroute.setRouteName(busroutedto.getRouteName());
	busroute.setSource(busroutedto.getSource());
	busroutei.save(busroute);
	
 }





@Override
public void updatePassword(String Username,String newpassword) {
	if(busoperatori.existsByBusOperatorUsername(Username))
	{
		BusOperator busoperator = busoperatori.findByBusOperatorUsername(Username);
		busoperator.setPassword(newpassword);
		busoperatori.save(busoperator);
	}
	else
	{
		throw new InvalidUsernameException();
	}
	
	
	

}

	
	}

		
	

	



	

	
	


