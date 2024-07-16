package com.example.autowiringspring.SpringbyType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("config.xml");
    	Person p=(Person)ctx.getBean("per");
        System.out.println(p);
    }
}
