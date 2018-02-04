package com.naveen.junit.spring.dao;

import org.springframework.stereotype.Component;

import com.naveen.junit.spring.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO {

	public int create(Ticket ticket) {
		return 1;
	}

}
