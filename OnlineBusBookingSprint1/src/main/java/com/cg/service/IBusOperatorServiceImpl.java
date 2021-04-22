package com.cg.service;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.dao.BusOperatorI;
import com.cg.entities.BusOperator;
@Service
public class IBusOperatorServiceImpl implements IBusOperatorService {

	@Autowired
	BusOperatorI busoperatori;
	@Override
	public  BusOperator addBusOperator(BusOperator busoperator) {
		// TODO Auto-generated method stub
		return busoperatori.save(busoperator);

	}
	

}
