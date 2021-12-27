package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
     /*
    Verify confirmation message
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an
external site.
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'
     */

    public static void main(String[] args) {
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement inputEmailBox = driver.findElement(By.name("email"));

        String expectedEmail = "zeynepdilara.b@gmail.com";

        inputEmailBox.sendKeys(expectedEmail);



        //somehow we should get text from web elements
        //two main ways to get text from web elements
        //1.getText() ----> it will work %99 and it will return String
        //2.getAttribute("value") ----> second way of getting text especially input boxes

        String actualEmail = inputEmailBox.getAttribute("value");
        System.out.println("actualEmail = " + actualEmail);

        //verify that email is displayed in the input box
        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //click on Retrieve password
        WebElement retrieveButton = driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        WebElement actualConfirmMessage = driver.findElement(By.name("confirmation_message"));
        System.out.println(actualConfirmMessage.getText());

        String expectedMessage = "Your e-mail's been sent!";

        String actualMessage = actualConfirmMessage.getText();

        if (expectedMessage.equals(actualMessage)) {

            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        driver.quit();




    }
}
