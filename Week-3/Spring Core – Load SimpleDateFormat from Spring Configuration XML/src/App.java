package com.cognizant.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        DateFormatter formatter =
                (DateFormatter) context.getBean("dateFormatter");

        formatter.displayCurrentDate();
    }
}
