package com.example.spring.Springwiringmobileexample;

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
    	Mobile m1=(Mobile)ctx.getBean("mob1");
    	
        System.out.println(m1);
	    Mobile m2=(Mobile)ctx.getBean("mob2");
    	
        System.out.println(m2);
        
        Person p=(Person)ctx.getBean("per1");
        System.out.println(p);
    }
}
