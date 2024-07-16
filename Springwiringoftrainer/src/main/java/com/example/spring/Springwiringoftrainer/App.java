package com.example.spring.Springwiringoftrainer;

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
    	Trainer tr=(Trainer) ctx.getBean("train1");
    	System.out.println(tr);
    	Kodnestclasses kc=(Kodnestclasses)ctx.getBean("kodclass");
        System.out.println( kc );
    }
}
