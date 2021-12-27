package com.cybertek.tests.seleniumreview;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase1 {
      public static void main(String[] args) {
            /*Test case
                    Go to Ebay
            search Selenium
            click on search button
            print number of results
            verify title contains Selenium*/

            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://www.ebay.co.uk/");

            //search Selenium
            WebElement searchBox = driver.findElement(By.id("gh-ac"));
            //WebElement searchBox = driver.findElement(By.name("_nkw"));
           // WebElement searchBox = driver.findElement(By.tagName("");
            //WebElement searchBox = driver.findElement(By.xpath("//<input[@class='gh-tb ui-autocomplete-input'"));


            String expectedSearchItem = "Selenium";

            searchBox.sendKeys(expectedSearchItem);

           WebElement searcButton = driver.findElement(By.id("gh-btn"));
           searcButton.click();

           //apply action
          WebElement searchResultElement = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));

          String searchResultText = searchResultElement.getText();
          System.out.println("searchResultText = " + searchResultText);

          String [] arr = searchResultText.split(" ");

          System.out.println("Number os search results = " + arr[0]);


          driver.close();


      }


}
