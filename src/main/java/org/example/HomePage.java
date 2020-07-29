package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends UtilClass
{
    //text link to verify if user is on homepage or not
    private By _verifytext = By.xpath("//h2[text()=\"Welcome to our store\"]");

    //Expected result
    private String _expectedText = "Welcome to our store";

    //click on register button method
    private By _registrationButton = By.xpath("//a[text()=\"Register\"]");
    //text link to verify if user is on Desktop Page or not

            //create a method to verify if the user is on homepage
    public void homePageVerification() {
        Assert.assertEquals(getElement(_verifytext), _expectedText, "you are not on hp");
    }

       //created method to click on registration button
    public void clickOnRegistrationButton() {
        clickable(_registrationButton);
        waitUntilElementIsClickable(_registrationButton, 400);
    }

}
