package com.tech.wsoft;

public class StrategyManager implements Strategy {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        strategy.operation(num1, num2);
    }
}
