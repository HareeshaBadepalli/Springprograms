package com.example.autowiringspring.Springalltypesofautowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml"); 
    	Car car=(Car)ctx.getBean("c1");
    	System.out.println(car);
        Car car1=(Car)ctx.getBean("c3");
        System.out.println(car1);
        University u1=(University)ctx.getBean("uni1");
        System.out.println(u1);
    }
}
