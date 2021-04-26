package com.cg.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/******************************************************
 * @author Bindhu Pandrangi
 * 
 * Description : This class is used fo entity mapping and generate getters and setter for Booking.
 * 
 */
@Entity
@Table(name="booking4")

public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(unique = true)

	private int bookingId; // busoperatorid+busid+date+time+uniqueNumber

	private String username; // login-username

	private String busNumber;

	private String source;

	private String destination;

	private int numberOfSeats;

	private int amountPaid;

	@Column(name = "dataOfBooking")

	private LocalDate date;

	private LocalTime journeyStartTime;

	private LocalTime journeyEndTime;

	public Booking() {
		super();

	}

	public Booking(int bookingId, String username, String busNumber, String source, String destination,
			int numberOfSeats, int amountPaid, LocalDate date, LocalTime journeyStartTime, LocalTime journeyEndTime) {
		super();
		this.bookingId = bookingId;
		this.username = username;
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.amountPaid = amountPaid;
		this.date = date;
		this.journeyStartTime = journeyStartTime;
		this.journeyEndTime = journeyEndTime;

	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getJourneyStartTime() {
		return journeyStartTime;
	}

	public void setJourneyStartTime(LocalTime journeyStartTime) {
		this.journeyStartTime = journeyStartTime;
	}

	public LocalTime getJourneyEndTime() {
		return journeyEndTime;
	}

	public void setJourneyEndTime(LocalTime journeyEndTime) {
		this.journeyEndTime = journeyEndTime;
	}

}
