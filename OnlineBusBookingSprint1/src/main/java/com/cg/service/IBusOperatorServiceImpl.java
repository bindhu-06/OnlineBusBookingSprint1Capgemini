package com.cg.service;

import java.time.LocalDate;

import java.util.List;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.cg.dao.BusI;
import com.cg.dao.BusOperatorI;
import com.cg.dto.BusOperatorDto;
import com.cg.entities.Booking;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
@Service
public class IBusOperatorServiceImpl implements IBusOperatorService {

	@Autowired
	BusOperatorI busoperatori;
	
	
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



	
	}

		
	

	



	

	
	


