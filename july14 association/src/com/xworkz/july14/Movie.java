package com.xworkz.july14;

public class Movie {
String name;
MovieType type;
String language="Telugu";
String timings;
Director director=new Director("P vasu",50,5.6,70);
Movie(String name)
{
	System.out.println("running String arg with Movie");
	this.name=name;
	
}
void movietype(MovieType type)
{
	this.type=type;
}
void printInfo()
{
	System.out.println(this.name);
	System.out.println(this.type);
	System.out.println(this.language);
	System.out.println(this.timings);
	this.director.printInfo();
}
}
