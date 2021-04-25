package com.cg;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.cg.dto.BusOperatorDto;
import com.cg.entities.Bus;
import com.cg.entities.BusRoute;
import com.cg.service.IBusOperatorService;

@SpringBootTest
class OnlineBusBookingSprint1ApplicationTests {

	@Autowired
	IBusOperatorService  ibusoperatorservice;
	@Test
	void addBusOperatorTest() {
		BusRoute busroute = new BusRoute(1,"aa","hyd","vij");
		Bus bus= new Bus (1,"Ap123",busroute,60,600);
		BusOperatorDto busoperatordto = new BusOperatorDto ("aaab","bbbb");
		assertEquals("aaab",ibusoperatorservice.addBusOperator(busoperatordto).getBusOperatorUsername());
		
	}

}
