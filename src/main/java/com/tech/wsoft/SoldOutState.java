package com.tech.wsoft;

public class SoldOutState implements State {

    private SodaVendingMachine vendingMachine;

    public SoldOutState(SodaVendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney() {

    }

    @Override
    public void ejectMoney() {

    }

    @Override
    public void select() {

    }

    @Override
    public void dispense() {

    }
}
