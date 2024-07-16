package com.example.autowiringspring.Springautowiringmobile;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.autowiringspring.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("config.xml");
 
	    Mobile m2=(Mobile)ctx.getBean("mob2");
    	
        System.out.println(m2);
        
        Mobile m1=(Mobile)ctx.getBean("mob");
    	
        System.out.println(m1);
        
        
        Person p=(Person)ctx.getBean("per");
        System.out.println(p);
    }
}
