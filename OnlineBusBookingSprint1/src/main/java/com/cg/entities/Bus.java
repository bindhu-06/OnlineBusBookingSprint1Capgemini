package com.cg.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="bus4")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int busId;
	
	private String busNumber;
	@OneToOne
	@JoinColumn(name="busrouteId")
	private BusRoute busRoute;
	private int totalSeats;
	private int fare;
	@ManyToOne
	@JoinColumn(name="busoperatorId",referencedColumnName = "busopeartorId")
	private  BusOperator busOperator;
	
	@OneToOne
	@JoinColumn(name="busoperatorrequestId")
	private BusOperatorRequest busOperatorRequest;
	public Bus(int busId, String busNumber, BusRoute busRoute, int totalSeats, int fare, BusOperator busOperator,
			BusOperatorRequest busOperatorRequest) {
		super();
		this.busId = busId;
		this.busNumber = busNumber;
		this.busRoute = busRoute;
		this.totalSeats = totalSeats;
		this.fare = fare;
		this.busOperator = busOperator;
		this.busOperatorRequest = busOperatorRequest;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
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
	public BusOperator getBusOperator() {
		return busOperator;
	}
	public void setBusOperator(BusOperator busOperator) {
		this.busOperator = busOperator;
	}
	public BusOperatorRequest getBusOperatorRequest() {
		return busOperatorRequest;
	}
	public void setBusOperatorRequest(BusOperatorRequest busOperatorRequest) {
		this.busOperatorRequest = busOperatorRequest;
	}
	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busNumber=" + busNumber + ", busRoute=" + busRoute + ", totalSeats="
				+ totalSeats + ", fare=" + fare + ", busOperator=" + busOperator + ", busOperatorRequest="
				+ busOperatorRequest + "]";
	}

}
