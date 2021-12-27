package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locating radio button
        WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
        WebElement redBtn = driver.findElement(By.id("red"));

        //how to check radio button is selected
        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        System.out.println("redBtn.isSelected() = " + redBtn.isSelected());

        //verify blue is selected red is not selected
        //blue
        Assert.assertTrue(blueRadioBtn.isSelected(),"verify that blue is selected");
        //red
        Assert.assertFalse(redBtn.isSelected(),"verify that red is not selected");

        //how to click radio button?
        redBtn.click();

        //blue
        Assert.assertFalse(blueRadioBtn.isSelected(),"verify that blue is NOT selected");
        //red
        Assert.assertTrue(redBtn.isSelected(),"verify that red is not selected");

        Thread.sleep(2000);
        driver.quit();


    }




}
