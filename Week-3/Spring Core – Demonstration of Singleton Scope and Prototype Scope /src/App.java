package com.cognizant.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("===== Singleton Scope =====");

        Employee emp1 = (Employee) context.getBean("singletonEmployee");
        Employee emp2 = (Employee) context.getBean("singletonEmployee");

        System.out.println("Object 1 HashCode : " + emp1.hashCode());
        System.out.println("Object 2 HashCode : " + emp2.hashCode());

        System.out.println();

        System.out.println("===== Prototype Scope =====");

        Employee emp3 = (Employee) context.getBean("prototypeEmployee");
        Employee emp4 = (Employee) context.getBean("prototypeEmployee");

        System.out.println("Object 3 HashCode : " + emp3.hashCode());
        System.out.println("Object 4 HashCode : " + emp4.hashCode());
    }
}
