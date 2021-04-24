package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.cg.dto.BusDto;
import com.cg.dto.BusOperatorDto;
import com.cg.dto.BusRouteDto;
import com.cg.entities.Booking;
import com.cg.entities.Bus;
import com.cg.entities.BusOperator;
import com.cg.exception.BusOperatorValidationException;
import com.cg.exception.InvalidBusOperatorException;
import com.cg.exception.InvalidRouteNameException;
import com.cg.service.BusOperatorServiceImpl;

@RestController
@RequestMapping(value="/busoperator")

public class BusOperatorController {
	
  @Autowired

 BusOperatorServiceImpl busoperatorserviceimpl;
  
  /**************************
   * Method: addBusOperator
   * Description: Method is created to add new BusOperator
   * @param busoperatordto
   * @return ResponseEntity<Object>
   * @PostMapping : Annotation for mapping HTTP POST requests onto add BusOperator
   * Created Date : 20 April 2021
   */

 @PostMapping(value="/addNewBusOperator")
public ResponseEntity<Object>addBusOperator(@Valid @RequestBody BusOperatorDto busoperatordto,BindingResult  bindingresult )
{
	 if (bindingresult.hasErrors()) {
			System.out.println("Some errors exist!");
			List<FieldError> fieldErrors = bindingresult.getFieldErrors();

			List<String> errMessages = new ArrayList<>();
			for (FieldError fe : fieldErrors) {
				errMessages.add(fe.getDefaultMessage());
			}
			throw new BusOperatorValidationException(errMessages);
			
		}
	 try {
		 busoperatorserviceimpl.addBusOperator(busoperatordto);
	 }
	 
catch(InvalidBusOperatorException exception) {
	throw new InvalidBusOperatorException("one or more entered field contains invalid object");
	
}
	return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
}
 
  /*******************************
   * Method: getRevenueByBusRoute
   * Description: Method is created to get  revenue by BusRoute
   * @param routeName
   * @return List<Booking>
   * @GetMapping : Annotation for mapping HTTP GET requests to view revenue by bus route
   * Created Date : 20 April 2021
   */
 
 
@GetMapping(value="/getrevenuebyroutename/{routeName}")
public List<Booking> getRevenueByBusRoute(@PathVariable String routeName)
{
	try {
	
	List<Booking> revenuebyroutename =busoperatorserviceimpl.getRevenueByBusRoute(routeName);
	return revenuebyroutename;
	}
	catch(InvalidRouteNameException exception)
	{
		throw new InvalidRouteNameException ("no Route found");
	}
	
}

  /***************************
   * Method: getMonthlyRevenueByBusRoute
   * Description: Method is created to get monthly revenue by BusRoute
   * @param routeName
   * @param month
   * @return List<Booking>
   * @GetMapping : Annotation for mapping HTTP GET requests to view monthly revenue by bus route
   * Created Date : 21 April 2021
   */

@GetMapping(value="/getmonthlyrevenuebyroutename/{routeName}/month/{month}")
public List<Booking>getMonthlyRevenueByBusRoute (@PathVariable String routeName,@PathVariable int month)
{
	
	return busoperatorserviceimpl.getMonthlyRevenueByBusRoute(routeName, month);
	
}

  /************************
   * Method: getRevenueByBusRouteAndDate 
   * Description: Method is created to get daily revenue by BusRoute 
   * @param routeName
   * @param date
   * @return List<Booking>
   * @GetMapping : Annotation for mapping HTTP GET requests to view daily revenue by bus route
   * Created Date : 22 April 2021
   */

@GetMapping(value="/getdaterevenuebyroutename/{routeName}/date/{date}")
public List<Booking>getRevenueByBusRouteAndDate (@PathVariable String routeName,@PathVariable String  date)
{

	LocalDate dt = LocalDate.parse(date);
	return busoperatorserviceimpl.getRevenueByBusRouteAndDate(routeName, dt);
	
}

  /***************************
   * Method: getYearlyRevenueByBusRoute
   * Description: Method is created to get yearly revenue by BusRoute
   * @param routeName
   * @param year
   * @return List<Booking>
   * @GetMapping : Annotation for mapping HTTP GET requests to view yearly revenue by bus route
   * Created Date : 22 April 2021
   */


@GetMapping(value="/getyearlyrevenuebyroutename/{routeName}/year/{year}")
public List<Booking>getYearlyRevenueByBusRoute(@PathVariable String routeName,@PathVariable int year)
{
	
	return busoperatorserviceimpl.getYearlyRevenueByBusRoute(routeName, year);
	
}
 /*************************
  * Method: addBus
   * Description: Method is created to add new Bus
  * @param busdto
  * @returnResponseEntity
  * @PostMapping : Annotation for mapping HTTP POST requests onto add Bus
  * Created Date : 22 April 2021
  */
  
@PostMapping(value="/addNewBus")
public ResponseEntity<Object>addBus(@RequestBody BusDto busdto)
{
	busoperatorserviceimpl.addBus(busdto);
	return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);

}

 /****************************************
  * Method: addBusRoute
  * Description: Method is created to add new BusRoute
  * @param busroutedto
  * @return ResponseEntity
  * @PostMapping : Annotation for mapping HTTP POST requests onto add BusRoute
  * Created Date : 22 April 2021
  */

@PostMapping(value="/addNewBusRoute")
public ResponseEntity<Object>addBusRoute(@RequestBody BusRouteDto busroutedto)
{
	busoperatorserviceimpl.addBusRoute(busroutedto);
	return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
}
	

@PutMapping(value="/updatePassword/{UserName}")
public ResponseEntity<Object>updatepassword(@PathVariable String UserName, @RequestBody  String password)
{
	busoperatorserviceimpl.updatePassword(UserName, password);
	return new ResponseEntity<Object>("Updatedsuccessfully", HttpStatus.OK);
}


}


