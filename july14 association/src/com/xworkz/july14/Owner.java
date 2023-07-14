package com.xworkz.july14;

public class Owner {
String ownerName;
String ownerVillage="Kodagu";
int age;
double height;
Owner()
{
	System.out.println("Running no-arg const in Owner");
}
Owner(String ownerName,String ownerVillage,int age,double height)
{
	System.out.println("Running String,String,int,double arg const in Owner");
	this.ownerName=ownerName;
	this.ownerVillage=ownerVillage;
	this.age=age;
	this.height=height;
}
void setage(int age)
{
	this.age=age;
}
void printInfo()
{
	System.out.println(this.ownerName);
	System.out.println(this.ownerVillage);
	System.out.println(this.age);
	System.out.println(this.height);
}
}
