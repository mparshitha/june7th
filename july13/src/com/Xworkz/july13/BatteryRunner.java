package com.Xworkz.july13;

public class BatteryRunner {
	public static void main(String[] arg) {
	// TODO Auto-generated method stub
	Battery ref=new Battery("Amaron");
	ref.batteryType(BatteryType.Lithium);
	ref.price=200;
	ref.display();
	
	Battery ref1=new Battery("Luminous");
	ref1.batteryType(BatteryType.Alkaline);
	ref1.price=300;
	ref1.display();
}
}
