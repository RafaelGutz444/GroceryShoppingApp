package com.company;
// Builder Pattern

interface Builder{
     String name();
     double price();
}

public abstract class CartBuilder implements Builder{

    @Override
    public abstract double price();


}
