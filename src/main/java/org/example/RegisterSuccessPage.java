package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterSuccessPage extends UtilClass
{
    //stored locators in different variables
    private By _achualText = By.xpath("//div[text()='Your registration completed']");
    private String _expectedText = "Your registration completed";
    //click on continue button
    private By _continueButton = By.xpath("//input[contains(@value,'Continue')]");


    public void regSuccessfullMsg ()
    {
        // Assert to check if Actual is = to Expected
        Assert.assertEquals(getElement(_achualText),_expectedText);

    }


}
