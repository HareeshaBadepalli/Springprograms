package com.example.spring.Springoflistsetandmap;

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
        Employee e1=(Employee)ctx.getBean("Emp1");
        System.out.println(e1);
        
    }
}
