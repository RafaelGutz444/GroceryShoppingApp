package com.company;

public class baguette extends CartBuilder {
    @Override
    public String name() {
        return "com.company.baguette";
    }

    @Override
    public double price() {
        return 1.99;
    }
}
