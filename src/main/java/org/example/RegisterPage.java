package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends UtilClass
{
    LoadProp loadProp = new LoadProp();
    // private variables to store locators
    private By _actualText = By.xpath("//h1[text()='Register']");
    private String  _expectedText = "Register";

    private By _genderButton = By.xpath("//input[@id ='gender-female']");
    private By _firstName = By.xpath("//input[@name='FirstName']");

    private By _lastName = By.xpath("//input[@name=\"LastName\"]");
    private By _dateOfBirth = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _monthOfBirth  = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _yearOfBirth = By.xpath("//select[@name=\"DateOfBirthYear\"]");

    private By _emailAddress = By.xpath("//input[@id='Email']");
    private By _companyName = By.xpath("//input[@name='Company']");
    private By _uncheckBox = By.xpath("//input[@type=\"checkbox\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _clickOnRegButton = By.xpath("//input[@name=\"register-button\"]");




    public void VerifyRegistrationPage()
    {
        //waitUntilElementVisible(_actualText,20);
        Assert.assertEquals(getElement(_actualText),_expectedText,"You are not on Registration page");
    }

    public void userEntersRegistrationDetail() {

        //waitUntilElementIsClickable(_genderButton,10);
        clickable(_genderButton);

        //waitUntilElementVisible(_firstName,40);

        //reusable method to input name
        sendkeyElement(_firstName,loadProp.getProperty("FirstName"));

        //reusable method to input name
        //sendkeyElement(_lastName,"Patel");
        sendkeyElement(_lastName,loadProp.getProperty("LastName"));

        //reusable method to select item from dropdown
        selectFromDropDownByIndex(_dateOfBirth,6);
        selectFromDropDownByVisibleText(_monthOfBirth,"July");
        selectFromDropDownByValue(_yearOfBirth,"2000");

        //use inbuilt timestamp method to save email
        String time = loadProp.getProperty("Email")+timeStamp()+loadProp.getProperty("Email2");

        //reusable method to input email

        sendkeyElement(_emailAddress,time);

        //Reusable method(sendkey) to input company name
        sendkeyElement(_companyName,loadProp.getProperty("CompanyName"));

        //Reusable method to click on uncheckbox
        clickable(_uncheckBox);

        //Reusable method- to input password
        sendkeyElement(_password,loadProp.getProperty("password"));
        sendkeyElement(_confPassword,loadProp.getProperty("ConfPassword"));

    }

    public void clickOnRegistration()
    {
        //Explicit wait
        waitUntilElementIsClickable(_clickOnRegButton,400);

        //reusable method to click on reg button
        clickable(_clickOnRegButton);
    }

}
