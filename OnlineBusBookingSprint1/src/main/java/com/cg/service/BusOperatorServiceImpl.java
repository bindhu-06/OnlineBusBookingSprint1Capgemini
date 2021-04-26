package com.cg.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.BusI;
import com.cg.dao.BusOperatorI;
import com.cg.dao.BusRouteI;
import com.cg.dto.BusDto;
import com.cg.dto.BusOperatorDto;
import com.cg.dto.BusRouteDto;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
import com.cg.entities.BusRoute;
import com.cg.exception.InvalidUsernameException;

  /****************************************
   * 
   * @author Bindhu Pandrangi
   *
   * Description : This is a class for service implementation for BusOperator, Bus, BusRoute entities.
   *
   */

@Service

public class BusOperatorServiceImpl implements IBusOperatorService {

	@Autowired
	BusOperatorI busoperatori;
	
	@Autowired
	BusI busi;
	
	@Autowired
	BusRouteI busroutei;
	/*******************************************************
	 * Method : addBusOperator
	 * Description: Method is created to add new BusOperator 
	 * Created Date: 19 April 2021
	 */
	
	@Transactional
	@Override
	public BusOperator addBusOperator(BusOperatorDto busoperatordto) {
		
		BusOperator busoperator = new BusOperator();
		busoperator.setBusOperatorUsername(busoperatordto.getUserId());
		busoperator.setPassword(busoperatordto.getPassword());
		return busoperatori.save(busoperator);
		
	}

	/***********************************************************
	 * Method : getRevenueByBusRoute
	 * Description: Method is created to get revenue byBusRoute
	 * Created Date: 19 April 2021
	 */
	
	@Transactional
	@Override
	public List<Float> getRevenueByBusRoute(String routeName) {
		
		return busoperatori.findRevenueByBusRouteRouteName(routeName);
		
	}
	
	/***************************************************************
	 * Method : getMonthlyRevenueByBusRoute
	 * Description: Method is created to getmonthly revenue by BusRoute
	 * Created Date: 19 April 2021 
	 */
	
	@Transactional
	@Override
	public List<Float> getMonthlyRevenueByBusRoute(String routeName, int month) {
		
		return busoperatori.findMonthlyRevenueByBusRouteRouteName(routeName, month);
		
	}
	
	/*********************************************************************
	 * Method : getRevenueByBusRouteAndDate
	 * Description: Method is created to get daily revenue by BusRoute
	 * Created Date: 19 April 2021 
	 */

	@Transactional
	@Override
	public List<Float> getRevenueByBusRouteAndDate(String routeName, LocalDate date) {
		
		return busoperatori.getRevenueByBusRouteAndDate(routeName, date);
		
	}
	
   /*******************************************************************
    * Method :  getYearlyRevenueByBusRoute
    * Description: Method is created to get yearly revenue by BusRoute
    *  Created Date: 19 April 2021
    */
	
	@Transactional
	@Override
	public List<Float> getYearlyRevenueByBusRoute(String routeName, int year) {
		
		return busoperatori.getYearlyRevenueByBusRoute(routeName, year);
		
	}
	
	/*************************************************
	 * Method : addBus
	 * Description: Method is created to add new Bus
	 * Created Date: 19 April 2021
	 */

	@Transactional
	@Override
	public Bus addBus(BusDto busdto) {
		
		Bus bus = new Bus();
		BusRoute busroute = busroutei.findById(busdto.getBusRouteId()).get();
		bus.setBusNumber(busdto.getBusNumber());
		bus.setFare(busdto.getFare());
		bus.setTotalSeats(busdto.getTotalSeats());
		bus.setBusRoute(busroute);
		return busi.save(bus);
		
	}
	
	/*************************************************************
	 * Method : addBusRoute
	 * Description: Method is created to add new BusRoute
	 * Created Date : 20 April 2021
	 */

	@Transactional
	@Override
	public BusRoute addBusRoute(BusRouteDto busroutedto) {
		
		BusRoute busroute = new BusRoute();
		busroute.setDestination(busroutedto.getDestination());
		busroute.setRouteName(busroutedto.getRouteName());
		busroute.setSource(busroutedto.getSource());
		return busroutei.save(busroute);
		
	}

	/************************************************************
	 * Method : updatePassword
	 * Description: Method is created to update password
	 * Created Date : 20 April 2021
	 */
	
	@Transactional
	@Override
	public void updatePassword(String Username, String newpassword) {
		
		if (busoperatori.existsByBusOperatorUsername(Username)) {
			BusOperator busoperator = busoperatori.findByBusOperatorUsername(Username);
			busoperator.setPassword(newpassword);
			busoperatori.save(busoperator);
		} else {
			throw new InvalidUsernameException();
		}

	}
	
}

		
	

	



	

	
	

