package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {

    public static void main(String[] args) {

        //open chrome and navigate to "http.//practice.cybertekschool.com"

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();  //empty web browser

        driver.navigate().to("http://practice.cybertekschool.com");

        //getting title with selenium
        //shortcut for creating variable
        //option or alt +enter enter
        //getTitle()---> get you the title of the page

        String title = driver.getTitle();
        //the shortcut is soutv +enter to print variable name and value
        System.out.println("title = " + title);

        //getCurrentUrl() --> get the url from browser
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //getPageSource() --> get the source of the page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);



    }
}
