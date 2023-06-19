package com.jsp.ManyToMany.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.jsp.ManyToMany.constant.EntityConstant;

@Entity
@Table(name = EntityConstant.PASSENEGER_INFO)
public class Passenger implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(joinColumns = { @JoinColumn(name = "p_id") },
	inverseJoinColumns = { @JoinColumn(name = "b_id") })
	private List<Bus> buses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Bus> getBuses() {
		return buses;
	}

	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}
}
