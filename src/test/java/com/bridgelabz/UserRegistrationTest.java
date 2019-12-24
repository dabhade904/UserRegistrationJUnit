package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @Before
    public void setUp() throws Exception {
        userRegistration=new UserRegistration();
    }

    @Test
    public void whenGivenFirstName_ShouldReturnValidName() {
        String firstName = userRegistration.validateUserFirstName("Sachin");
        Assert.assertEquals("Valid", firstName);
    }

    @Test
    public void whenGivenFirstName_WithCaps_ShouldReturnValidName(){
        String firstName=userRegistration.validateUserFirstName("Sachin");
        Assert.assertEquals("Valid",firstName);
    }

    @Test
    public void whenGivenFistName_WithMinimumThreeCharacter_ShouldReturnValidName() {
        String firstName=userRegistration.validateUserFirstName("Sac");
        Assert.assertEquals("Valid",firstName);
    }
    @Test
    public void whenGivenFirstName_WithLessTwoChar_ShouldReturnInvalidName() {
        String firstName=userRegistration.validateUserFirstName("sa");
        Assert.assertEquals("Invalid",firstName);
    }

    @Test
    public void whenGivenFirstName_WithoutCaps_ShouldReturnInvalidName() {
        String firstName=userRegistration.validateUserFirstName("sachin");
        Assert.assertEquals("Invalid",firstName);
    }

    @Test
    public void whenGivenFirstName_IfSpaceEncountered_ShouldReturnInvalidName(){
        String firstName=userRegistration.validateUserFirstName("Sac in");
        Assert.assertEquals("Invalid",firstName);
    }

    @Test
    public void whenGivenLastName_ShouldReturnValidName() {
        String lastName = userRegistration.validateUserLastName("Dabhade");
        Assert.assertEquals("Valid",lastName);
    }

    @Test
    public void whenGivenLastName_WithCaps_ShouldReturnValidName(){
        String lastName=userRegistration.validateUserLastName("Dabhade");
        Assert.assertEquals("Valid",lastName);
    }

    @Test
    public void whenGivenLastName_WithMinimumThreeCharacter_ShouldReturnValidName() {
        String lastName = userRegistration.validateUserLastName("DDab");
        Assert.assertEquals("Valid", lastName);
    }

    @Test
    public void whenGivenLastName_WithLessTwoChar_ShouldReturnInvalidName() {
        String lastName=userRegistration.validateUserLastName("sa");
        Assert.assertEquals("Invalid",lastName);
    }

    @Test
    public void whenGivenLastName_WithoutCaps_ShouldReturnInvalidName() {
        String lastName=userRegistration.validateUserLastName("sachin");
        Assert.assertEquals("Invalid",lastName);
    }

    @Test
    public void whenGivenLastName_IfSpaceEncountered_ShouldReturnInvalidName(){
        String lastName=userRegistration.validateUserLastName("Sac in");
        Assert.assertEquals("Invalid",lastName);
    }

    //User email validation
    @Test
    public void whenGivenEmail_IfContainsMondatoryParts_ShouldReturnValidEmail(){
        String emailId=userRegistration.validateUserEmail("abc.xyz@bl.co.in");
        Assert.assertEquals("Valid",emailId);
    }

    @Test
    public void whenGivenEmail_IfHasOptionalPart_ShouldReturnValidEmail(){
        String emailId=userRegistration.validateUserEmail("abc@bl.co");
        Assert.assertEquals("Valid",emailId);
    }

    @Test
    public void whenGivenEmail_IfInvalid_ShouldReturnInvalidEmail() {
        String emailId=userRegistration.validateUserEmail("dabhade904@gmail.com.com.in");
        Assert.assertEquals("Invalid",emailId);
    }

//  Validate mobile number
    @Test
    public void whenGivenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        boolean mobileNumber=userRegistration.validateMobileNumber("91 8888948943");
        Assert.assertTrue(mobileNumber);
    }
    @Test
    public void whenGivenMobileNumber_WhenNotGivenSpace_ShouldReturnFalse(){
        boolean mobileNumber=userRegistration.validateMobileNumber("9188888948943");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void whenGivenMobileNumber_WhenPassCharacter_ShouldReturnFalse(){
        boolean mobileNumber=userRegistration.validateMobileNumber("abcdefg");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void whenGivenMobileNumber_WhenSpecialCharacter_ShouldReturnFalse(){
        boolean mobileNumber=userRegistration.validateMobileNumber("abcdefg");
        Assert.assertFalse(mobileNumber);
    }

    @Test
    public void whenGivenMobile_WhenPassSpaceAtAnyPosition_ShouldReturnFalse() {
        boolean mobileNumber=userRegistration.validateMobileNumber("91 88889 48934");
        Assert.assertFalse(mobileNumber);
    }

//  Password validation minimum eight characters
    @Test
    public void whenGivenPassword_IfMinimumEightCharacters_ShouldReturnTrue(){
        boolean userPassword=userRegistration.validateUserPassword("pass2122");
        Assert.assertTrue(userPassword);
    }

    @Test
    public void whenGivenPassword_WhenSpecialSymbol_ShouldReturnFalse(){
       boolean userPassword=userRegistration .validateUserPassword("pass@123");
        Assert.assertFalse(userPassword);
    }

    @Test
    public void whenGivenPassword_IfCharacterAboveEight_ShouldReturnFalse() {
        boolean userPassword=userRegistration.validateUserPassword("pass123");
        Assert.assertFalse(userPassword);
    }
}