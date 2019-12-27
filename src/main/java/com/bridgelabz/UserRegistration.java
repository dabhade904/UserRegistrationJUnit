package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public boolean validateUserEmail(String emailId) {
        Pattern mobilePattern= Pattern.compile("^[a-zA-Z0-9]{1,}[._+-]?[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}([.][a-zA-Z]{2,3}){1,2}$");
        Matcher matcher=mobilePattern.matcher(emailId);

        if (matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean validateMobileNumber(String mobileNumber) {
        Pattern mobilePattern= Pattern.compile("^[0-9]{2,2}[ ][7,8,9]{1,1}[0-9]{9}$");
        Matcher matcher=mobilePattern.matcher(mobileNumber);

        if (matcher.matches())
        {
            return true;
        }
        else
        {
            return  false;
        }
    }

    public boolean validateUserPassword(String password) {
        String pass =("^[a-zA-Z0-9]{8,}$");
        Pattern passwordPattern=Pattern.compile(pass);
        Matcher matcher=passwordPattern.matcher(password);
        if (matcher.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean validateUserPasswordUpperCase(String upperCasePassword) {
        String pass=("[a-z0-9]*[A-Z]+[a-zA-Z0-9]*$");
        Pattern passwordPattern=Pattern.compile(pass);
        Matcher matcher=passwordPattern.matcher(upperCasePassword);
        if(matcher.matches())
        {
            return  true;
        }
        else
        {
            return false;
        }
    }

    public  boolean passwordValidation(String password){
        String pass="(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[+@#$%^&*!.()-]).{8,}";
        Pattern passwordPattern=Pattern.compile(pass);
        Matcher matcher=passwordPattern.matcher(password);
        if(matcher.matches())
            return true;
        else
            return false;
    }

}

