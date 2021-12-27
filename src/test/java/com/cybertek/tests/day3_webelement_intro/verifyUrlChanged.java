package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {

    public static void main(String[] args) {
     /*Verify URL not changed
    -open chrome browser
    -go to http://practice.cybertekschool.com/forgot_password Links to an
external site.
    -enter any email
    -click on Retrieve password
    -verify that url changed to http://practice.cybertekschool.com/email_sent
*/
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));
        //sendKeys() ----> send keyboard action to the webelement
        emailInputBox.sendKeys("mike@cybertek.com");

        WebElement retrieveButton = driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        //TASK
        //verify that url changed to http://practice.cybertekschool.com/email_sent
        //create expected url
        String expectedUrl = "http://practice.cybertekschool.com/email_sents";

        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }

        driver.quit();










    }
}
