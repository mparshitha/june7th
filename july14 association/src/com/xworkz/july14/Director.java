package com.xworkz.july14;

public class Director {
String directorName;
int age;
double height;
int weight;
Director()
{
	System.out.println("Running no-arg in Director");
}
Director(String directorName,int age,double height,int weight)
{
	System.out.println("Running String,int,int,int const of director");
	this.directorName=directorName;
	this.age=age;
	this.height=height;
	this.weight=weight;
}
void setage(int age)
{
	this.age=age;

}
void printInfo()
{
System.out.println(this.directorName);
System.out.println(this.age);
System.out.println(this.height);
System.out.println(this.weight);
}
}
