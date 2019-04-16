package com.tech.wsoft;

public class StateFactory {

    public static State getState(int noOfSodas, SodaVendingMachine vendingMachine) {
        if (noOfSodas > 0) {
            return new NoMoneyState(vendingMachine);
        }

        throw new IllegalArgumentException("No proper count found");
    }

}
