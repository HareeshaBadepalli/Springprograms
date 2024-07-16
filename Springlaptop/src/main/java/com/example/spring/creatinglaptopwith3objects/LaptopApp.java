package com.example.spring.creatinglaptopwith3objects;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	       Laptop l1=(Laptop)ctx.getBean("Lap1");
	       Laptop l2=(Laptop)ctx.getBean("Lap2");
	       Laptop l3=(Laptop)ctx.getBean("Lap3");
	      System.out.println(l1);
	      System.out.println(l2);
	      System.out.println(l3);
	}
}
