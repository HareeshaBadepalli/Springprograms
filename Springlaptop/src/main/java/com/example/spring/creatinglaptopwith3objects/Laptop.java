package com.example.spring.creatinglaptopwith3objects;
public class Laptop {
	int sno;
	String brand;
	int price;
	public Laptop() {
		
	}
	public Laptop(int sno, String brand, int price) {
		super();
		this.sno = sno;
		this.brand = brand;
		this.price = price;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [sno=" + sno + ", brand=" + brand + ", price=" + price + "]";
	}
}
