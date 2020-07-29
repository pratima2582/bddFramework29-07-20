package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends UtilClass
{
              //created object for browser manager class
    BrowserManager browserManager = new BrowserManager();

    @Before                   //before tag
    public void openBrowser()
    {
        browserManager.setBrowser();
    }

    @After                   //after tag
    public void closeBrowser()
    {
        browserManager.closeBrowser();
    }

}
