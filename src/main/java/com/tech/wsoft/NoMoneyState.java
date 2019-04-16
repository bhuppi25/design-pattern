package com.tech.wsoft;

public class NoMoneyState implements State {


    private SodaVendingMachine vendingMachine;

    public NoMoneyState(SodaVendingMachine vendingMachine) {
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
