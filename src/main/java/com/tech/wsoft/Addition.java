package com.tech.wsoft;

public class Addition implements Strategy {

    @Override
    public void operation(int num1, int num2) {
        System.out.println("Sum = " + (num1 + num2));
    }
}
