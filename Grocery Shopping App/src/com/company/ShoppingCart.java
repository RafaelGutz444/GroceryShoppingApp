package com.company;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Builder> list = new ArrayList<>();

    public void addItem(Builder item){
        list.add(item);
    }
    public double getCost(){
        double cost = 0.0;

        for (Builder item : list){
            cost += item.price();
        }
        return cost;
    }
    public void displayItems(){
        for (Builder item: list){
            System.out.print("Item: "+ item.name() + " ");
            System.out.print(", Price: $"+ item.price()+ "   \n");

        }
    }
}
class FoodBundles{
    public ShoppingCart assembleMeat (){
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new chicken());
        cart.addItem(new steak());
        return cart;
    }
    public ShoppingCart bakeryStop(){
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new baguette());
        cart.addItem(new flour());
        return cart;
    }
}

