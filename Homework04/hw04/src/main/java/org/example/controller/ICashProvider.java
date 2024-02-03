package org.example.controller;

import org.example.model.Customer;

public interface ICashProvider {
    boolean buy(int price);
    boolean repealTicket(int price);
    boolean authorizationCustomer(Customer customer);
}
