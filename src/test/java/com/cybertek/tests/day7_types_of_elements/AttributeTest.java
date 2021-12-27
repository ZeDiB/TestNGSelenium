package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributeTest {

    @Test
    public void test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueButton = driver.findElement(By.id("blue"));

        blueButton.getAttribute("value");

        //get the value of attribute
        System.out.println(blueButton.getAttribute("type"));

        //get th value of attribute
        System.out.println(blueButton.getAttribute("name"));

        //get the value of check
        //since check attribute  does not keep any value, it will return true or false based on the
        System.out.println(blueButton.getAttribute("checked"));

        //trying to get attribute that does not exist
        //when we use non exist attribute it will return null to us
        System.out.println(blueButton.getAttribute("href"));

        System.out.println(blueButton.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.name("button2"));

        System.out.println(button2.getAttribute("outerHTML"));
        String outerHtml = button2.getAttribute("outerHTML");
        Assert.assertTrue(outerHtml.contains("Button 2"));

        System.out.println("InnerHTML: "+button2.getAttribute("innerHTML"));


        driver.quit();


    }
}
