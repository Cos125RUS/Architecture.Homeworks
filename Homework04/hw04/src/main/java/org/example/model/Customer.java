package org.example.model;

import lombok.Data;
import org.example.service.TicketService;

import java.util.List;

@Data
public class Customer implements Ticketable{
    private int id;
    private List<Ticket> tickets;
    private TicketService ticketService;
    private long card;

    @Override
    public boolean buyTicket(Ticket ticket) {
        boolean result = ticketService.buy(ticket);
        if (result)
            tickets.add(ticket);
        return result;
    }

    @Override
    public boolean repealTicket(Ticket ticket) {
        boolean result = ticketService.buy(ticket);
        if (result)
            tickets.add(ticket);
        return result;
    }

    @Override
    public Ticket searchTicket(int rootNumber) {
        return ticketService.searchTicket(rootNumber);
    }
}
