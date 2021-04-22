package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="busroute4")
public class BusRoute {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int busrouteId;
	private String routeName ;
	private String source;
	private String destination;
	
	@OneToOne(mappedBy="busRoute")
  
	private Bus bus;

	public BusRoute(int busrouteId, String routeName, String source, String destination, Bus bus) {
		super();
		this.busrouteId = busrouteId;
		this.routeName = routeName;
		this.source = source;
		this.destination = destination;
		this.bus = bus;
	}

	public BusRoute() {
		super();
		// TODO Auto-generated constructor stub
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

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "BusRoute [busrouteId=" + busrouteId + ", routeName=" + routeName + ", source=" + source
				+ ", destination=" + destination + ", bus=" + bus + "]";
	}
}
