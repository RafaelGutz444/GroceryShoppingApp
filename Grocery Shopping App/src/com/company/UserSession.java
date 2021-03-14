package com.company;
// Singleton Design Pattern  -- Later will serve as the object that holds a user's session cookie.

public class UserSession {

    private static UserSession instance = null;  // Creates User Session instance

    private UserSession() {
    }


    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
            }
        System.out.print("User session created. Login was successful. \n");
                /* Future plans will include implementing on a server so a user session would actually become a cookie on
                   user device that allows their actions to be saved in the case of disconnection from the server so this user session
                   will be important later on.
                 */
        return instance;
        }

    }
