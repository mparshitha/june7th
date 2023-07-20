package com.Xworkz.SuperChaining;

public class ChickenRunner {

	public static void main(String[] args) {
		
			Chicken chicken=new Chicken(675,"VijayNagar");
			chicken.printInfo();
			
			System.out.println("           ");
			
			Chicken farmChicken=new FarmChicken(10,"madeena chicken center",6,"Thirthesh");
			farmChicken.printInfo();
			
			System.out.println("           ");

			Chicken boilerChicken=new BroilerChicken(13,"Farm",true,6.9); 
			boilerChicken.printInfo();
			
			
			
			
		}

	}


