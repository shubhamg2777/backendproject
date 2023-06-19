package com.jsp.OneToMany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import com.jsp.OneToMany.constant.EntityConstant;


@Entity
@Table(name =  EntityConstant.MOBILE_INFO)
public class Mobile implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "brand")
	private String brand;
	@Column(name = "colour")
	private String colour;
	@Column(name = "price")
	private int price;
	@Column(name = "ramsize")
	private String ramSize;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobile_id")
	private List<Application> applicationList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public List<Application> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}

}
