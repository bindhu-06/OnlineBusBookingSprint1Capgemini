package com.cg.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Table(name = "busoperator4")

public class BusOperator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int busopeartorId;

	@Column(unique = true)
	@NotEmpty(message = "username should not be empty")
	private String busOperatorUsername;

	@NotEmpty(message = "password should not be empty")
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Bus> bus;

	public BusOperator(int busopeartorId, String busOperatorUsername, String password, List<Bus> bus) {
		super();
		this.busopeartorId = busopeartorId;
		this.busOperatorUsername = busOperatorUsername;
		this.password = password;
		this.bus = bus;
	}

	public BusOperator() {
		super();

	}

	public int getBusopeartorId() {
		return busopeartorId;
	}

	public void setBusopeartorId(int busopeartorId) {
		this.busopeartorId = busopeartorId;
	}

	public String getBusOperatorUsername() {
		return busOperatorUsername;
	}

	public void setBusOperatorUsername(String busOperatorUsername) {
		this.busOperatorUsername = busOperatorUsername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Bus> getBus() {
		return bus;
	}

	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}

}
