package com.bridgelabz;

public class UserRegistration {
    public String userFirstName(String firstName) {
        if (firstName.matches("^[A-Z][a-zA-Z]{2,}$"))
        {
            return "Valid";
        }
        else
        {
            return "Invalid";
        }

    }
}
