package com.demo.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/SpringProject/spring.xml");
    	//Vehicle obj = (Vehicle)context.getBean("vehicle");
        Vehicle obj = (Vehicle)context.getBean("car");
        obj.drive();
    }
}
