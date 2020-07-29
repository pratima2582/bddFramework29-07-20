package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class BrowserManager extends UtilClass
{
    LoadProp loadProp = new LoadProp();

    public void setBrowser() {
        String browsername = "ie";

        //giving if condition to check cross browser
        if (browsername.equalsIgnoreCase("chrome"))
        {

            System.setProperty("webdriver.chrome.driver", "src\\test\\Resourses\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();     //creating chrome driver object to open google chrome browser
        }
            else if (browsername.equalsIgnoreCase("firefox"))
            {
                System.setProperty("webdriver.gecko.driver","src\\test\\Resourses\\BrowserDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
            else if (browsername.equalsIgnoreCase("ie"))
            {
                System.setProperty("webdriver.ie.driver","src\\test\\Resourses\\BrowserDriver\\IEDriverServer.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                driver = new InternetExplorerDriver();
            }
            else
                {
                  System.out.println("Please enter valid BrowserName : ");
                }

        driver.manage().window().maximize();   //maximizing screen
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //giving implicity wait
        driver.get(loadProp.getProperty("url"));   //open the URL
        }

    public void closeBrowser ()
    {
         driver.close();
    }
}

