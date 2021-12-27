package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFOR CLASS--");
        System.out.println("executed one time before the class");
    }

    @Test
    public void test1(){

        System.out.println("First test case");

    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("Second test case");

    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Webdriver , opening Browser");
    }

    @AfterMethod
    public void tearTown(){
        System.out.println("Closing browser, quit");
    }
    @Test
    public void tets3(){
        System.out.println("Third test case");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("--AFTER CLASS");
        System.out.println("Some reporting code here");
    }




}
