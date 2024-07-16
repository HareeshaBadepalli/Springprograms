package com.example.spring.Student;

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
	       studentobjects l1=(studentobjects)ctx.getBean("s1");
	       System.out.println(l1);
    }
}
