package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void whenGivenFirstName_ShouldReturnValidName() {
        UserRegistration userRegistration = new UserRegistration();
        String firstName = userRegistration.userFirstName("Sachin");
        Assert.assertEquals("Valid", firstName);
    }

    @Test
    public void whenGivenFirstName_WithCaps_ShouldReturnValidName(){
        UserRegistration userRegistration=new UserRegistration();
        String firstName=userRegistration.userFirstName("Sachin");
        Assert.assertEquals("Valid",firstName);
    }

    @Test
    public void whenGivenFistName_WithMinimumThreeCharacter_ShouldReturnValidName() {
        UserRegistration userRegistration=new UserRegistration();
        String firstName=userRegistration.userFirstName("Sac");
        Assert.assertEquals("Valid",firstName);
    }
    @Test
    public void whenGivenFirstName_WithLessTwoChar_ShouldReturnInvalidName() {
        UserRegistration userRegistration=new UserRegistration();
        String firstName=userRegistration.userFirstName("sa");
        Assert.assertEquals("Invalid",firstName);
    }

    @Test
    public void whenGivenFirstName_WithoutCaps_ShouldReturnInvalidName() {
        UserRegistration userRegistration=new UserRegistration();
        String firstName=userRegistration.userFirstName("sachin");
        Assert.assertEquals("Invalid",firstName);
    }

    @Test
    public void whenGivenFirstName_IfSpaceEncountered_ShouldReturnInvalidName(){
        UserRegistration userRegistration=new UserRegistration();
        String firstName=userRegistration.userFirstName("Sac in");
        Assert.assertEquals("Invalid",firstName);
    }

}