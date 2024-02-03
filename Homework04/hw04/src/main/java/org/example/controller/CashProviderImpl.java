package org.example.controller;

import org.example.model.Customer;

public class CashProviderImpl implements ICashProvider{
    private Long card;
    private boolean isAuthorization;

    public CashProviderImpl(Long card) {
        this.card = card;
        isAuthorization = false;
    }

    @Override
    public boolean buy(int price) {
//        ..
        return true;
    }

    @Override
    public boolean repealTicket(int price) {
//        ..
        return true;
    }

    @Override
    public boolean authorizationCustomer(Customer customer) {
        isAuthorization = customer.getCard() == card;
        return isAuthorization;
    }
}
