package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser {

    public static void main(String[] args) {
//        //we have to enter this line every time we want to open chrome
//        //het webDriverManager, can you make chrome ready for me for automation
//        WebDriverManager.chromedriver().setup();
//
//        //creating WebDriver object.webdriver represent the browser
//        //we are creating driver for chrome browser
//        //new ChromeDriver()---> this part to open the chrome browser
//        WebDriver driver = new ChromeDriver();   //---->it is an empty browser
//
//        //.get(url) method used for navigation to page
//        driver.get("https://cybertekschool.com");  //it execute and navigated to the browser

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver2 = new FirefoxDriver();

        driver2.get("https://cybertekschool.com");




    }
}
