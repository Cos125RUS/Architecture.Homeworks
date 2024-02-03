package org.example.service;

import lombok.AllArgsConstructor;
import org.example.controller.ICashProvider;
import org.example.controller.ITicketProvider;
import org.example.model.Ticket;

import java.util.List;

@AllArgsConstructor
public class TicketService {
    private ITicketProvider ticketProvider;
    private ICashProvider cashProvider;

    public boolean buy(Ticket ticket) {
        boolean result = cashProvider.buy(ticket.getPrice());
        if (result) {
            ticket.setValid(true);
            ticketProvider.updateTicketStatus(ticket);
        }
        return result;
    }

    public List<Ticket> getTickets() {
        return ticketProvider.getTickets();
    }

    public boolean repeal(Ticket ticket) {
        boolean result = ticketProvider.updateTicketStatus(ticket);
        if (result) {
            cashProvider.repealTicket(ticket.getPrice());
        }
        return result;
    }

    public Ticket searchTicket(int rootNumber) {
        return ticketProvider.getTickets().get(rootNumber);
    }
}
