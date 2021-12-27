package com.cybertek.tests.seleniumreview;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;

public class CheckboxHW {

//    Test Case Verify CheckBox CheckAll and UncheckAll Buttons
//1. Go to
//    http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
//            2. Login with-----Username: Tester, password: test
//3. Click on check all button verify all the checkboxes are checked
//4. Click on uncheck all button verify that all the checkboxes are unchecked
//5. Select one of the checkbox and delete one person
//6. Then verify that deleted item is no longer exists

    WebDriver driver;

    @BeforeClass
    public void setClass(){

        driver = WebDriverFactory.getDriver("chrome");

    }
    @BeforeMethod
    public void openPage(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.manage().window().maximize();
        //Loogin functionalty
        WebElement useranemeBox = driver.findElement(By.id("ctl00_MainContent_username"));
        useranemeBox.sendKeys("Tester");

        WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordBox.sendKeys("test");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    }
    @AfterClass
    public void cloeseBrowser()   {driver.close();}
    @AfterMethod
    public void killSession()     {driver.quit();}

    @Test (priority = 1)
    public void checkBoxAll() throws InterruptedException {
        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();

        WebElement checkboxFirst = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector"));

        for(int i=1;i<=8;i++){
            String rowLocator = "(//input[@type='checkbox'])["+i+"]";
            Assert.assertTrue(driver.findElement(By.xpath(rowLocator)).isSelected(),"The Checkbox IS NOT selected");

        }

        WebElement uncheckAllBox = driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
        uncheckAllBox.click();

        for(int i=1;i<=8;i++){
            String rowLocator = "(//input[@type='checkbox'])["+i+"]";
            Assert.assertFalse(driver.findElement(By.xpath(rowLocator)).isSelected(),"The Checkbox IS STILL selected");

        }


//        WebElement idAttribute;
//        for (int i = 2; i < 10; i++) {
//
//            idAttribute = driver.findElement(By.id(("ctl00_MainContent_orderGrid_ctl0" + i + "_OrderSelector")));
//            Assert.assertTrue(idAttribute.isSelected());
//        }

    }
    @Test (priority = 2)
    public void deletePersonTest() throws InterruptedException {

        String name = "Bob Feather";

        String locatorCheckBoxPerson = "//*[contains(text(),'" +name+"')]/preceding-sibling::*/input (sibling method)";

        WebElement checkboxBob = driver.findElement(By.xpath(locatorCheckBoxPerson));
        checkboxBob.click();

        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

       //After i delete i will get all te names and put them in an arraylist then verify that delete person is not in the list

        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i <7; i++) {
            String eachnameLocatoor = "(//input[@type='checkbox'])["+i+"]/../..td[2]";
            WebElement eachnameElement = driver.findElement(By.xpath(eachnameLocatoor));
            String eachname = eachnameElement.getText();

        }

        System.out.println("names = " + names);
        Assert.assertFalse(names.contains(name),"The name is still there, could not delete");


    }
}
