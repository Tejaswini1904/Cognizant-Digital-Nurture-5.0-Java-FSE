package com.cognizant.springcore;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Log LOGGER = LogFactory.getLog(App.class);

    public static void main(String[] args) {

        LOGGER.info("Application Started");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld =
                (HelloWorld) context.getBean("helloWorld");

        helloWorld.displayMessage();

        LOGGER.info("Application Ended");
    }
}
