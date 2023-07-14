package com.xworkz.july14;

public class Franchise {
String industry;
String owners;
int noOfFranchise=10;
int netWorth;
Franchise()
{
	System.out.println("Running no-arg const of Franchise");
}
Franchise(String industry,String owners,int noOfFranchise,int netWorth)
{
	System.out.println("Running String,String,int,int arg const of Franchise");
	this.industry=industry;
	this.owners=owners;
	this.noOfFranchise=noOfFranchise;
	this.netWorth=netWorth;
}
void setnetWorth(int netWorth)
{
	this.netWorth=netWorth;
}
void printInfo()
{
	System.out.println(this.industry);
	System.out.println(this.owners);
	System.out.println(this.noOfFranchise);
	System.out.println(this.netWorth);
}
}
