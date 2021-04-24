package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="busroute4")
public class BusRoute {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int busrouteId;
	@NotEmpty(message="routename should not be empty")
	
	private String routeName ;
	@NotEmpty(message="source should not be empty")
	
	private String source;
	@NotEmpty(message="destination should not be empty")
	private String destination;

	public BusRoute(int busrouteId, String routeName, String source, String destination) {
		super();
		this.busrouteId = busrouteId;
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
		
	}

	public BusRoute() {
		super();
		
	}

	public int getBusrouteId() {
		return busrouteId;
	}

	public void setBusrouteId(int busrouteId) {
		this.busrouteId = busrouteId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
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

	}
