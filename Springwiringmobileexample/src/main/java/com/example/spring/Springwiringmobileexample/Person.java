package com.example.spring.Springwiringmobileexample;

public class Person {
  Mobile m1;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(Mobile m1) {
	super();
	this.m1 = m1;
}
public Mobile getM1() {
	return m1;
}
public void setM1(Mobile m1) {
	this.m1 = m1;
}
@Override
public String toString() {
	return "Person [m1=" + m1 + "]";
}

  
}
