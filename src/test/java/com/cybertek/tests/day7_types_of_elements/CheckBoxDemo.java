package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkboxInput1 = driver.findElement(By.xpath("//input[1]"));
        WebElement checkboxInput2 = driver.findElement(By.xpath("//input[2]"));

        //How to verify checkbox is selected or not?
        System.out.println("checkboxInput1.isSelected() = " + checkboxInput1.isSelected());
        System.out.println("checkboxInput2.isSelected() = " + checkboxInput2.isSelected());

        //Verify checkbox 1 is not selected, 2 is selected
        Assert.assertFalse(checkboxInput1.isSelected(),"verify checkbox1 is not selected");
        Assert.assertTrue(checkboxInput2.isSelected(),"verify checkbox2 is selected");

        Thread.sleep(2000);
        checkboxInput1.click();

        //verify after click
        Assert.assertTrue(checkboxInput1.isSelected(),"verify checkbox1 is selected");
        Assert.assertTrue(checkboxInput2.isSelected(),"verify checkbox2 is selected");

        Thread.sleep(2000);

        driver.quit();



    }




}
