package com.cg.service;

import java.util.List;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.cg.dao.BusI;
import com.cg.dao.BusOperatorI;
import com.cg.dto.BusOperatorDto;
import com.cg.entities.Booking;
import com.cg.entities.BusOperator;
@Service
public class IBusOperatorServiceImpl implements IBusOperatorService {

	@Autowired
	BusOperatorI busoperatori;
	
	
	@Override
	public  BusOperator addBusOperator(BusOperatorDto busoperatordto) {
		BusOperator busoperator=new BusOperator();
		busoperator.setBusOperatorUsername(busoperatordto.getUserId());
		busoperator.setPassowrd(busoperatordto.getPassword());
		return busoperatori.save(busoperator);
		

	}


	@Override
	public BusOperator updatePassoword(BusOperatorDto busoperatordto) {
		BusOperator busoperator=new BusOperator();
		 
		return busoperatori.save(busoperator);
	}


	@Override
	public List<Booking> getRevenueByBusRoute(String routeName) {
		// TODO Auto-generated method stub
		return ;
	}



	

	
	

}
