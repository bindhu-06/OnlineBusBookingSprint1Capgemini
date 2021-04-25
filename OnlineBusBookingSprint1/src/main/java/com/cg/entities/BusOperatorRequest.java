package com.cg.entities;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/*************************************************
 * @author Bindhu Pandrangi
 * 
 * Description : This class is used fo entity mapping and generate getters and setter for BusOperatorRequest.
 *
 */
@Entity
@Table(name="busoperatorrequest4")

public class BusOperatorRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busoperatorrequestId;

	//@NotEmpty(message = "busoperator username should not be empty")
	private String busOperatorUsername;

	//@NotEmpty(message = "request messeage should not be empty")
	private String requestMsg;

	//@NotEmpty(message = "request for message should not be empty")
	private String requestFor; // Possible values deleteBus,update Fare,Change Route , Change Time

	//@NotEmpty(message = "status should not be empty")
	private boolean status; // approved = true , unapproved = false

	//@NotEmpty(message = "date should not be null")
	private LocalDate requestDate;
	
	//@NotEmpty(message = "bus should not be null")
	@OneToOne(cascade = CascadeType.ALL)
	private Bus bus;

	public BusOperatorRequest(int busoperatorrequestId, String busOperatorUsername, String requestMsg,
			String requestFor, boolean status, LocalDate requestDate, Bus bus) {
		super();
		this.busoperatorrequestId = busoperatorrequestId;
		this.busOperatorUsername = busOperatorUsername;
		this.requestMsg = requestMsg;
		this.requestFor = requestFor;
		this.status = status;
		this.requestDate = requestDate;
		this.bus = bus;
	}

	public BusOperatorRequest() {
		super();
	}

	public int getBusoperatorrequestId() {
		return busoperatorrequestId;
	}

	public void setBusoperatorrequestId(int busoperatorrequestId) {
		this.busoperatorrequestId = busoperatorrequestId;
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

}
