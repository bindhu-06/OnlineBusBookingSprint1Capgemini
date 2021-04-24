package com.cg.service;

import org.springframework.stereotype.Service;
import com.cg.entities.Booking;
import com.cg.entities.Bus;
import com.cg.dto.BusOperatorDto;
import com.cg.entities.BusOperator;

import java.time.LocalDate;
import java.util.List;
import com.cg.entities.BusOperator;
@Service
public interface IBusOperatorService {
	public BusOperator addBusOperator(BusOperatorDto busoperatordto);
	
	
 public List<Booking> getRevenueByBusRoute(String routeName);
 public List<Booking> getMonthlyRevenueByBusRoute(String routeName,int month);
 public List<Booking> getRevenueByBusRouteAndDate(String routeName,LocalDate date);
 public List<Booking> getYearlyRevenueByBusRoute(String routeName,int year);


}
	
	
