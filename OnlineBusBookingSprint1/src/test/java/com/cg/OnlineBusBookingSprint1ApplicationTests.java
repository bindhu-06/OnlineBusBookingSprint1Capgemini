package com.cg;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cg.dto.BusDto;
import com.cg.dto.BusOperatorDto;
import com.cg.exception.InvalidUsernameException;
import com.cg.service.IBusOperatorService;

@SpringBootTest
class OnlineBusBookingSprint1ApplicationTests {

	@Autowired
	IBusOperatorService  ibusoperatorservice;
	@Test
	void addBusOperatorTest() {
	
		BusOperatorDto busoperatordto = new BusOperatorDto ("srinivas","bindhu1234");
		ibusoperatorservice.addBusOperator(busoperatordto);
		assertEquals("srinivas",ibusoperatorservice.addBusOperator(busoperatordto).getBusOperatorUsername());
		
	} 
	@Test
	void addBusTest()
	{
	    BusDto busdto=new BusDto("Ap123",600,60,56);
		assertEquals(56,ibusoperatorservice.addBus(busdto).getBusId());
	}
	@Test
	void updatePasswordTest()
	{
		assertThrows(InvalidUsernameException.class,()->ibusoperatorservice.updatePassword("","1234"));
	}

}
