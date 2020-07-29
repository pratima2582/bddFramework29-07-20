package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UtilClass extends BasePage {

        //created method to give wait untill element clickable
        public void waitUntilElementIsClickable(By by, int time) {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.elementToBeClickable(by));
        }

        public void waitUntilElementVisible(By by, int time) {   //created method to give wait untill element visible
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }

        public void sleep1(int n) // try and catch reusable method
        {
            try {
                Thread.sleep(n * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void clickable(By by) {
            driver.findElement(by).click();
        } //created method to click element

        public String getElement(By by) {
            return driver.findElement(by).getText();
        } //created method to get text


        //created method for timestamp
        public long timeStamp() {
            return System.currentTimeMillis();


        }                            // created method to select value from dropdown

        public void selectFromDropDownByValue(By by, String value) {
            Select sel = new Select(driver.findElement(by));
            sel.selectByValue(value);
        }                 //created method to select dropdown value

        public void selectFromDropDownByVisibleText(By by, String text) {
            Select sel = new Select(driver.findElement(by));
            sel.selectByVisibleText(text);
        }


        //created method to select index from dropdown

        public void selectFromDropDownByIndex(By by, int num) {
            Select sel = new Select(driver.findElement(by));
            sel.selectByIndex(num);
        }                 //created method for sendkey

        public void sendkeyElement(By by, String data) {
            driver.findElement(by).clear();
            driver.findElement(by).sendKeys(data);
        }

        public void assertUrl(String text) {

            Assert.assertTrue(driver.getCurrentUrl().contains(text));
        }

        //Reusable method to assert
        public String assertMassageText(By by) {
            return driver.findElement(by).getText();
        }
        //reusable method screenshot

        public void takeSnapShot(String screenShotName)//Creating
        {
            //convert web driver object to take screenshot
            // TakesScreenshot screenshot = ((TakesScreenshot)driver);
            // call screen shot method to create image file
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            try {

                FileHandler.copy(srcFile, new File("src\\Screenshot" + screenShotName + ".jpg"));
                // another way to use screenshot
                // FileHandler.copy(srcFile, new File("src\\Screenshot" + screenShotName + ".jpg"));
                FileUtils.copyFile(srcFile, new File("src\\Screenshot\\" + screenShotName + ".jpg"));
                System.out.println("ScreenShot taken");
            }
            catch (IOException e) {
                e.printStackTrace();}
        }
        }



