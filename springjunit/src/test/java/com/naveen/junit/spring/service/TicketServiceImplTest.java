package com.naveen.junit.spring.service;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.naveen.junit.spring.dao.TicketDAO;
import com.naveen.junit.spring.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TicketServiceImplTest {

	private static final String PASSENGER_NO = "9911223344";
	private static final String PASSENGER_NAME = "naveen";
    
	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks
	private TicketServiceImpl service;
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void test() {
		when(dao.create(any(Ticket.class))).thenReturn(1);
		int result=service.buyTicket(PASSENGER_NAME, PASSENGER_NO);
		assertEquals(result,1);
	}

}
