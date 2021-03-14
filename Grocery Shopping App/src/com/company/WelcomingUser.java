package com.company;

import java.util.Scanner;

interface Startup{
    public default String execute() {
        return null;
    }
}


public class WelcomingUser implements Startup{
    @Override
    public String execute() {

            String object;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Have you shopped with us before or do you need to create an account? If you have enter 'yes', if not then enter 'no':  ");
            object = scanner.nextLine();
            return object;



    }
}

