package com.Xworkz.july13;

public class BottleCompany {
String name;
String inventor="Nathaniel Wyeth's";
int weight;
int height;
BottleCompany()
{
	System.out.println("Running no-arg const in BottleCompany");
}
BottleCompany(String name,String inventor,int weight,int height)
{
	System.out.println("Running String,String,int,int arg const in BottleCompany");
	this.name=name;
	this.inventor=inventor;
	this.weight=weight;
	this.height=height;
}
void setweight(int weight)
{
	System.out.println(this.weight);
	this.weight=weight;
}
void display()
{
	System.out.println(this.name);
	System.out.println(this.inventor);
	System.out.println(this.weight);
	System.out.println(this.height);
}
}
