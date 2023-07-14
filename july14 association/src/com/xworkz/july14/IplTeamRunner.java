package com.xworkz.july14;

public class IplTeamRunner {

	public static void main(String[] args) {
		System.out.println("Running main in IplTeamRunner");
		IplTeam iplteam=new IplTeam("RCB");
		iplteam.noOfPlayers=25;
		iplteam.iplteamtype(IplTeamType.VIRTUAL);
		iplteam.printInfo();

	}

}
