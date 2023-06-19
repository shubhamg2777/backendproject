package com.gaurav.Spring_xml.XmlConfig;

public class Car {

	
	String id;
	String cubicCapacity;
	String brand;
	
	public Car()
	{
		System.out.println(this.getClass().getName()+"class Object crated");
	}
	
	
	public void carDetails()
	{
		System.out.println("car details .........");
	}


	public Car(String id, String cubicCapacity, String brand) {
		super();
		this.id = id;
		this.cubicCapacity = cubicCapacity;
		this.brand = brand;
	}
	
	


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCubicCapacity() {
		return cubicCapacity;
	}


	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", cubicCapacity=" + cubicCapacity + ", brand=" + brand + "]";
	}
	
	
	
}
