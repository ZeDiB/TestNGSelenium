package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NAMELocatorTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser full screen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Zeynep Bakir");

        //task
        //put some email and click sign up

        //proper way
//        WebElement emailInputButton = driver.findElement(By.name("email"));
//        emailInputButton.sendKeys("zeynepdilara.b@gmail.com");

        //lazy way
        driver.findElement(By.name("email")).sendKeys("zeynepdilara.b@gmail.com");


//        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
//        signUpButton.click();

        //lazy way
        driver.findElement(By.name("wooden_spoon")).click();








    }
}
