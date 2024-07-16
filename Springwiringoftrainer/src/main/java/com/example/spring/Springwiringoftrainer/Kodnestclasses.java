package com.example.spring.Springwiringoftrainer;

public class Kodnestclasses {
	Trainer tr;
	public Kodnestclasses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kodnestclasses(Trainer tr) {
		super();
		this.tr = tr;
	}

	public Trainer getTr() {
		return tr;
	}

	public void setTr(Trainer tr) {
		this.tr = tr;
	}

	@Override
	public String toString() {
		return "Kodnestclasses [tr=" + tr + "]";
	}
}
