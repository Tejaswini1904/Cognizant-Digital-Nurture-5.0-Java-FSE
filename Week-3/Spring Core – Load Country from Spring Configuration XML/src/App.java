package com.cognizant.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = context.getBean("country", Country.class);

        System.out.println("Country Details");
        System.out.println("----------------");
        System.out.println("Code : " + country.getCode());
        System.out.println("Name : " + country.getName());
    }
}
