package org.example.model;

public interface Ticketable {
    boolean buyTicket(Ticket ticket);
    boolean repealTicket(Ticket ticket);
    Ticket searchTicket(int rootNumber);
}
