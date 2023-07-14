package com.xworkz.july14;

public class IplTeam {
String name;
int noOfteams=10;
int noOfPlayers;
IplTeamType Type;
Franchise franchise=new Franchise("Prathmesh Mishra","United Spirits Limited",10,850);
IplTeam(String name)
{
	System.out.println("Running String arg const of IplTeam");
this.name=name;
}
IplTeam(int noOfteams,int noOfPlayers)
{
	System.out.println("Running int,int arg const of IplTeam");
	this.noOfteams=noOfteams;
	this.noOfPlayers=noOfPlayers;
}
void iplteamtype(IplTeamType type)
{
	this.Type=type;
}
void printInfo()
{
	System.out.println(this.name);
	System.out.println(this.noOfteams);
	System.out.println(this.noOfPlayers);
	System.out.println(this.Type);
	this.franchise.printInfo();
}
}
