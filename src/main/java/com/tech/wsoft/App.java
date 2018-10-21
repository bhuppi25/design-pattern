package com.tech.wsoft;

public class App {

    public static void main(String[] args) {
        StrategyManager manager = new StrategyManager();
        manager.setStrategy(new Addition());
        manager.operation(10, 99);
    }
}
