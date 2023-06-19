package com.gaurav.SpringXmlStudent;

public class Student {
	
	
	private Integer rollNumber;
	private String name;
	private String address;
	
	
	
	
	public Student(Integer rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	public Student()
	{
		System.out.println(this.getClass().getSimpleName()+"Object is created");
	}
	
	public void studentDetails()
	{
		System.out.println(" Student details is created !!!!!!!");
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
