package com.cg.dto;

public class BusDto {
	
	private  String busNumber;
 private int fare;
 private int totalSeats;
 private int busRouteId;
public BusDto(String busNumber, int fare, int totalSeats, int busRouteId) {
	super();
	this.busNumber = busNumber;
	this.fare = fare;
	this.totalSeats = totalSeats;
	this.busRouteId = busRouteId;
}
public BusDto() {
	super();
	
}
public String getBusNumber() {
	return busNumber;
}
public void setBusNumber(String busNumber) {
	this.busNumber = busNumber;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
public int getBusRouteId() {
	return busRouteId;
}
public void setBusRouteId(int busRouteId) {
	this.busRouteId = busRouteId;
}
}
 
