package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        System.out.print("Welcome! Let's get your groceries ordered! \n");

        WelcomingUser hello = new WelcomingUser();   // utilizes the command design pattern
        String checking;
        checking = hello.execute();

        if (Objects.equals(checking, "yes")) {

            System.out.print(" Begin 'LoginFunction'.  \n");
            System.out.print("-----------------------------------------------------------------\n");

            Login login = new LoginProxy();  // requests and checks login information.
            login.loginCheck();


            UserSession session = UserSession.getInstance();
            System.out.print(session+ "    \n");
            System.out.print("\n");



            System.out.print("We've assembled the meats you needed.  \n");
            FoodBundles foodBundles = new FoodBundles();
            ShoppingCart assembleMeat = foodBundles.assembleMeat();
            System.out.print("Meats: ");
            assembleMeat.displayItems();
            System.out.print("Total: $"+ assembleMeat.getCost() + "\n");
            System.out.print("\n");



            System.out.print("The bakery had just the items you needed. \n");
            FoodBundles bakery = new FoodBundles();
            ShoppingCart bakeryStop = foodBundles.bakeryStop();
            System.out.print("Items: ");
            bakeryStop.displayItems();
            System.out.print("Total: $"+ bakeryStop.getCost());




        } else if (Objects.equals(checking, "no")){

            System.out.print(" Begin 'Account Creation' Function.  \n");

        } else{

            System.out.print(" Invalid input. ");
        }







    }



    public static void addItem(){


    }

    public static void removeItem(){

    }

    public static void editItem(){

    }

    public static void checkout(){

    }

//    for (int i=0; i<36; i++){
//        for (int j=1; j<4;j++) {
//
//            System.out.println(instance[i][j] + " ");
//        }
//        System.out.print("\n");
//    }

}




