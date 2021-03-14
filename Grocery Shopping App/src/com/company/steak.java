package com.company;

public class steak extends CartBuilder{
    @Override
    public String name() {
        return "steak";
    }

    @Override
    public double price() {
        return 4.00;
    }
}
