package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        //send keyys to fulname
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Zeynep Bakir");

        //sendkeys to email
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("zeynepdilara.b@gmail.com");

        //lazy way
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);

        driver.quit();




    }
}
