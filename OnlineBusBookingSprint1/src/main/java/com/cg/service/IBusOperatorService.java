package com.cg.service;

import org.springframework.stereotype.Service;
import com.cg.entities.Booking;

import com.cg.dto.BusOperatorDto;
import com.cg.entities.BusOperator;
import java.util.List;
import com.cg.entities.BusOperator;
@Service
public interface IBusOperatorService {
	public BusOperator addBusOperator(BusOperatorDto busoperatordto);
	public BusOperator updatePassoword(BusOperatorDto busoperatordto);
	public List<Booking> getRevenueByBusRoute(String routeName);
}
	
	
