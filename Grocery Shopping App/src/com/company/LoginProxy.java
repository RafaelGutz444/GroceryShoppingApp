package com.company;
// Proxy Design Pattern

import java.util.Scanner;

interface Login{
    int loginCheck();
}

class RealLogin implements Login{

    @Override
    public int loginCheck(){

        System.out.print("Thank you! \n");

        return 0;
    }

    }


public class LoginProxy implements Login{
    private Login login = new RealLogin();
    static String[][] userNames = new String[][]{{"Demo", "Demo"}, {"Raf", "Raf"}, {"Nowak", "Nowak"}
        };


    @Override
    public int loginCheck() {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username:  \n");
        String usernameInput = scanner.nextLine();




        int rowCount = userNames.length;
        for (int i=0; i < rowCount; i++){

            if (usernameInput.equals(userNames[i][0])){
                System.out.print("Found you "+ usernameInput + "\n");
//                System.out.print("Now check for password in same row as where the username was located. \n");
                System.out.print("-------------------------------------------------------------------------------- \n");

                System.out.print("enter your password. \n");
                Scanner scanner1 = new Scanner(System.in);
                String passwordInput = scanner1.nextLine();

                if (passwordInput.equals(userNames[i][1])){
                    System.out.print("Password confirmed. Welcome " + usernameInput +" let's check out the produce! \n");
                }
                else{
                    System.out.print("Incorrect password. ");
                }
                i = rowCount;

            }
            else if (i == rowCount - 1){
                System.out.print("Username not found. ");
            }

        }
        login.loginCheck();
        return rowCount;
    }
}
