package com.cybertek.tests;

import com.github.javafaker.Faker;

public class firstClass {

    public static void main(String[] args) {
        //System.out.println("Hello World");

        Faker faker = new Faker();

        System.out.println(faker.name().fullName());   //this is random name
        System.out.println(faker.shakespeare().hamletQuote());
        System.out.println(faker.finance().creditCard());


    }


}
