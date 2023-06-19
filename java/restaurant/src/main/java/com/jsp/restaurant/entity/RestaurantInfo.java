package com.jsp.restaurant.entity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import com.jsp.restaurant.constant.EntityConstant;

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
@Entity
@Table(name = EntityConstant.RESTAURANT_INFO)
public class RestaurantInfo implements Serializable { 
	@Id
	@GenericGenerator(name="auto",strategy ="increment")
	@GeneratedValue(generator ="auto")
	@Column(name = "id")
	public Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
	@Column(name = "rating")
	private String rating;
	@Column(name = "menu")
	private String menu;
	@Column(name = "type")
	private String type;
	@Column(name = "pin_code")
	private String pincode;

	public RestaurantInfo() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long i) {
		this.id = i;
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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "RestaurantInfo [id=" + id + ", name=" + name + ", address=" + address + ", rating=" + rating + ", menu="
				+ menu + ", type=" + type + ", pincode=" + pincode + "]";
	}
}