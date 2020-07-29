package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs
{
    //Created objects for different classes
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()
    {
        homePage.homePageVerification();      //calling  method via object

    }

    @When("^user clicks on registration button$")
    public void user_clicks_on_registration_button()
    {
        homePage.clickOnRegistrationButton();    //calling  method via object
    }

    @When("^verify user is on registration page$")
    public void verify_user_is_on_registration_page()
    {
       registerPage.VerifyRegistrationPage();  //calling  method via object
    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()
    {
       registerPage.userEntersRegistrationDetail();  //calling  method via object
    }

    @When("^user clicks on registration-submit button$")
    public void user_clicks_on_registration_submit_button()
    {
        registerPage.clickOnRegistration();//calling clickon method via object
    }

    @Then("^user should able to see registration successful massage$")
    public void user_should_able_to_see_registration_successful_massage()
    {
        registerSuccessPage.regSuccessfullMsg();   //calling  method via object
    }

}
