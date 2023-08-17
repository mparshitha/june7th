package com.xworkz.app.market;

import java.io.Serializable;

public class MarketDTO implements Serializable {
	private String type;
	private String location;
	private int floors;
	private String owner;
	private boolean highPrices;
	
	
	public MarketDTO(String type, String location, int floors, String owner, boolean highPrices) {
		super();
		this.type = type;
		this.location = location;
		this.floors = floors;
		this.owner = owner;
		this.highPrices = highPrices;
	}
	@Override
	public String toString() {
		return "MraketDTO [type=" + type + ", location=" + location + ", floors=" + floors + ", owner=" + owner
				+ ", highPrices=" + highPrices + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isHighPrices() {
		return highPrices;
	}
	public void setHighPrices(boolean highPrices) {
		this.highPrices = highPrices;
	}
}
