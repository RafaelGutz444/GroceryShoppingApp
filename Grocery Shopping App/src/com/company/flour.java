package com.company;

public class flour extends CartBuilder{
    @Override
    public String name() {
        return "flour";
    }

    @Override
    public double price() {
        return 3.00;
    }
}
