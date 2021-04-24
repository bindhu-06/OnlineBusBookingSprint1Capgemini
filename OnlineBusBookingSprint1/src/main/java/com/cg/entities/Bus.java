package com.cg.entities;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="bus4")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int busId;
	@NotEmpty(message="busnumber should not be empty")
	private String busNumber;
	@OneToOne
	@JoinColumn(name="busrouteId")
	@NotEmpty(message="busroute should not be empty")
	private BusRoute busRoute;
	@NotEmpty(message="no of seats should not be empty")
	private int totalSeats;
	@NotEmpty(message="fare should not be empty")
	private int fare;
	public Bus(int busId, String busNumber, BusRoute busRoute, int totalSeats, int fare) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busRoute = busRoute;
		this.totalSeats = totalSeats;
		this.fare = fare;
	}
	public Bus() {
		super();
		
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public BusRoute getBusRoute() {
		return busRoute;
	}
	public void setBusRoute(BusRoute busRoute) {
		this.busRoute = busRoute;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	
}
	
	
	
	