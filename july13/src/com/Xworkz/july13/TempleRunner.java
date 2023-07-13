package com.Xworkz.july13;

public class TempleRunner {

	public static void main(String[] args) {
		Temple ref=new Temple("Shree Lakshmi Venkateshwara");
		ref.templeType(TempleType.Nagara);
		ref.location="BTM 1st Stage";
		ref.display();
		
		Temple ref1=new Temple("Shree Anjanaya");
		ref1.templeType(TempleType.Dravida);
		ref1.location="Jayanagar 7th Block";
		ref1.display();

	}

}
