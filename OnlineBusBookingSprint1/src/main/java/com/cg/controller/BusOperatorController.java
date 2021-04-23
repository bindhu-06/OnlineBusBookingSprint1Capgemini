package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.cg.dto.BusOperatorDto;
import com.cg.entities.BusOperator;

import com.cg.service.IBusOperatorServiceImpl;

@RestController
@RequestMapping(value="/busoperator")
@CrossOrigin("*")

public class BusOperatorController {
@Autowired
IBusOperatorServiceImpl ibusoperatorserviceimpl;
@PostMapping(value="/addNewBusOperator")
public ResponseEntity<Object>addBusOperator(@RequestBody BusOperatorDto busoperatordto)
{
	ibusoperatorserviceimpl.addBusOperator(busoperatordto);
	return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
	
	
	
}

}
