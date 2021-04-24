package com.cg.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="busoperatorrequest4")
public class BusOperatorRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busoperatorrequestId;
	
	private int caseNumber;
	private String busOperatorUsername;
	private String requestMsg;
	private String requestFor; // Possible values deleteBus,update Fare,Change Route , Change Time
	private boolean status; // approved = true , unapproved = false
	private LocalDate requestDate;
	@OneToOne(cascade=CascadeType.ALL )
	private Bus bus;
	public BusOperatorRequest(int busoperatorrequestId, int caseNumber, String busOperatorUsername, String requestMsg,
			String requestFor, boolean status, LocalDate requestDate, Bus bus) {
		super();
		this.busoperatorrequestId = busoperatorrequestId;
		this.caseNumber = caseNumber;
		this.busOperatorUsername = busOperatorUsername;
		this.requestMsg = requestMsg;
		this.requestFor = requestFor;
		this.status = status;
		this.requestDate = requestDate;
		this.bus = bus;
	}
	public BusOperatorRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBusoperatorrequestId() {
		return busoperatorrequestId;
	}
	public void setBusoperatorrequestId(int busoperatorrequestId) {
		this.busoperatorrequestId = busoperatorrequestId;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}
	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}
	public String getRequestMsg() {
		return requestMsg;
	}
	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}
	public String getRequestFor() {
		return requestFor;
	}
	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	@Override
	public String toString() {
		return "BusOperatorRequest [busoperatorrequestId=" + busoperatorrequestId + ", caseNumber=" + caseNumber
				+ ", busOperatorUsername=" + busOperatorUsername + ", requestMsg=" + requestMsg + ", requestFor="
				+ requestFor + ", status=" + status + ", requestDate=" + requestDate + ", bus=" + bus + "]";
	}
	

}
