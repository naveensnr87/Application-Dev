package com.naveen.junit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naveen.junit.spring.dao.TicketDAO;
import com.naveen.junit.spring.dto.Ticket;

@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;

	public int buyTicket(String passangername, String phone) {
		Ticket ticket = new Ticket();
		ticket.setPassangername(passangername);
		ticket.setPhone(phone);
		return getDao().create(ticket);
	}

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

}
