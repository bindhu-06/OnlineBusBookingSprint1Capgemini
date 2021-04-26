package com.cg.service;

import org.springframework.stereotype.Service;
import com.cg.entities.Bus;
import com.cg.dto.BusDto;
import com.cg.dto.BusRouteDto;
import com.cg.dto.BusOperatorDto;
import com.cg.entities.BusOperator;
import com.cg.entities.BusRoute;
import java.time.LocalDate;
import java.util.List;

@Service

public interface IBusOperatorService {

	public BusOperator addBusOperator(BusOperatorDto busoperatordto);

	public Bus addBus(BusDto busdto);

	public BusRoute addBusRoute(BusRouteDto busroutedto);

	public void updatePassword(String Username, String newpassword);

	public List<Float> getRevenueByBusRoute(String routeName);

	public List<Float> getMonthlyRevenueByBusRoute(String routeName, int month);

	public List<Float> getRevenueByBusRouteAndDate(String routeName, LocalDate date);

	public List<Float> getYearlyRevenueByBusRoute(String routeName, int year);

}
	
	
