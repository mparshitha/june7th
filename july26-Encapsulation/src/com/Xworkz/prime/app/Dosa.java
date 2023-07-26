package com.Xworkz.prime.app;

public class Dosa {
private int type;
private double price;
private String shape;
private String color;
private String name;
@Override
	public String toString() { 
		return " type:"+ this.type + " price:" + this.price + " shape:" + this.shape +" color:" + this.color + " name:" + this.name;
	}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public String getShape() {
	return shape;
}
public void setShape(String shape) {
	this.shape = shape;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
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
