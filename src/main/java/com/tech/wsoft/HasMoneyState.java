package com.tech.wsoft;

public class HasMoneyState implements State {

    private SodaVendingMachine vendingMachine;

    public HasMoneyState(SodaVendingMachine vendingMachine) {
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
