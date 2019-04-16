package com.tech.wsoft;

public class SodaVendingMachine {

    private State currentState;
    private int noOfSodas;

    public SodaVendingMachine(int noOfSodas) {
        this.noOfSodas = noOfSodas;
        setState(StateFactory.getState(noOfSodas, this));
    }

    private void setState(State state) {
        this.currentState = state;
    }
}
