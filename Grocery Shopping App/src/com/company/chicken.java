package com.company;

public class chicken extends CartBuilder{
    @Override
    public String name() {
        return "chicken";
    }

    @Override
    public double price() {
        return 4.00;
    }
}
