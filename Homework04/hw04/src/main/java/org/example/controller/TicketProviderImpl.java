package org.example.controller;

import org.example.model.Ticket;

import java.util.List;

public class TicketProviderImpl implements ITicketProvider{
    private List<Ticket> ticketList;

    @Override
    public List<Ticket> getTickets() {
        return ticketList;
    }

    @Override
    public boolean updateTicketStatus(Ticket ticket) {
        ticketList.get(ticket.getRootNumber()).setValid(ticket.isValid());
        return ticket.isValid();
    }
}
