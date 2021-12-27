package com.cybertek.tests.seleniumreview;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tast2 {
    /*
    * go to https://www.demoblaze.com/index.html#
    Navigate to Laptops Category
    Then Sony vaio i7 laptop
    Verify the product price is 790 Dollars
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.demoblaze.com/index.html#");

        WebElement laptopCateg = driver.findElement(By.linkText("Laptops"));
        laptopCateg.click();

        Thread.sleep(3000);

        WebElement soniaFind = driver.findElement(By.partialLinkText("Sony vaio i7"));
        soniaFind.click();

        Thread.sleep(3000);

        int expectedPrice = 700;
        WebElement actualPrice = driver.findElement(By.className("price-container"));
        String price =actualPrice.getText();

        System.out.println("price = " + price);

        String [] arr = price.split(" ");

        int actualprice = Integer.parseInt(arr[0].substring(1));

        System.out.println("actualprice = " + actualprice);

        System.out.println("Actual and expected price is same : "+(expectedPrice==actualprice));

        if(expectedPrice==actualprice) {
            System.out.println("Expected and actual prices are the same: " + (expectedPrice == Integer.parseInt(price)));
        } else {
            System.out.println("Expected Price = " + expectedPrice);
            System.out.println("Actual Price = " + price);
        }
        driver.quit();

    }

}
