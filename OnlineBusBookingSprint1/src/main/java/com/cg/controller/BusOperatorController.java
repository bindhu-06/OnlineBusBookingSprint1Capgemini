package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.cg.dto.BusOperatorDto;
import com.cg.entities.Booking;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;

import com.cg.service.IBusOperatorServiceImpl;

@RestController
@RequestMapping(value="/busoperator")
//@CrossOrigin("*")

public class BusOperatorController {
@Autowired
IBusOperatorServiceImpl ibusoperatorserviceimpl;
@PostMapping(value="/addNewBusOperator")
public ResponseEntity<Object>addBusOperator(@RequestBody BusOperatorDto busoperatordto)
{
	ibusoperatorserviceimpl.addBusOperator(busoperatordto);
	return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
}

@GetMapping(value="/addNewSum/{routeName}")
public List<Booking> getRevenueByBusRoute(@PathVariable String routeName)
{
	
	return ibusoperatorserviceimpl.getRevenueByBusRoute(routeName);
	
}
@GetMapping(value="/addNewMonthSum/{routeName}/month/{month}")
public List<Booking>getMonthlyRevenueByBusRoute (@PathVariable String routeName,@PathVariable int month)
{
	
	return ibusoperatorserviceimpl.getMonthlyRevenueByBusRoute(routeName, month);
	
}
@GetMapping(value="/addNewdateSum/{routeName}/date/{date}")
public List<Booking>getRevenueByBusRouteAndDate (@PathVariable String routeName,@PathVariable String  date)
{
	//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate dt = LocalDate.parse(date);
	return ibusoperatorserviceimpl.getRevenueByBusRouteAndDate(routeName, dt);
	
}
@GetMapping(value="/addNewyearSumyear/{routeName}/year/{year}")
public List<Booking>getYearlyRevenueByBusRoute(@PathVariable String routeName,@PathVariable int year)
{
	
	return ibusoperatorserviceimpl.getYearlyRevenueByBusRoute(routeName, year);
	
}
	
}


