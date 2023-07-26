package com.Xworkz.prime.app;

public class Satellite {
	private String type;
	private double latitude;
	private String shape;
	private String color;
	private String name;
	@Override
		public String toString() { 
			return " type:"+ this.type + " latitude:" + this.latitude + " shape:" + this.shape +" color:" + this.color + " name:" + this.name;
		}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public double getlatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
