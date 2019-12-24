package com.bridgelabz;

public class UserRegistration {
    public String validateUserFirstName(String firstName) {
        if (firstName.matches("^[A-Z][a-zA-Z]{2,}$"))
        {
            return "Valid";
        }
        else
        {
            return "Invalid";
        }
    }

    public String validateUserLastName(String lastName){
        if(lastName.matches("^[A-Z]{1}[a-zA-Z]{2,}$"))
        {
            return "Valid";
        }
        else
        {
            return  "Invalid";
        }
    }

    public String validateUserEmail(String emailId) {
        if (emailId.matches("^[a-zA-Z0-9][-._+a-zA-Z0-9]*[@]{1}[a-z]*[.]{1}[a-z]{2,3}[.]{0,1}([a-z]{2,3}){0,1}$"))
        {
            return "Valid";
        }
        else
        {
            return "Invalid";
        }

    }

}
