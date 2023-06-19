package com.jsp.ManyToMany.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.jsp.ManyToMany.constant.EntityConstant;

@Entity
@Table(name= EntityConstant.BUS_INFO)
public class Bus implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bus_id")
	private Long id;
	@Column(name = "bus_name")
	private String busName;
	@Column(name = "type")
	private String type;
	@ManyToMany(mappedBy = "buses", cascade = CascadeType.ALL)
	private List<Passenger> passenger;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
}
