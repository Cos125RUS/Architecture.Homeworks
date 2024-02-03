package org.example.controller;

import org.example.model.Ticket;

import java.util.List;

public interface ITicketProvider {
    List<Ticket> getTickets();
    boolean updateTicketStatus(Ticket ticket);
}
