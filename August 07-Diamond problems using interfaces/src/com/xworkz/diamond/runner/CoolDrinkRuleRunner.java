package com.xworkz.diamond.runner;
import com.xworkz.diamond.app.coolDrink.AppleCoolDrink;
import com.xworkz.diamond.app.coolDrink.CoolDrinkRule;
import com.xworkz.diamond.app.coolDrink.MangoCoolDrink;
import com.xworkz.diamond.app.coolDrink.MyCoolDrink;
public class CoolDrinkRuleRunner {

	public static void main(String[] args) {
System.out.println("Running main in Cool Drink Rule Runner\n");
		
		CoolDrinkRule drink1 = new MyCoolDrink();
		drink1.buyDrink();
		drink1.getCool();
		
		System.out.println(" ");
		
		MangoCoolDrink mango = new MyCoolDrink();
		mango.buyDrink();
		mango.getCool();
		mango.getCrushed();
		
		System.out.println(" ");
		
		AppleCoolDrink apple = new MyCoolDrink();
		apple.buyDrink();
		apple.getApple();
		apple.getCool();
		
		System.out.println(" ");
		
		MyCoolDrink myDrink = new MyCoolDrink();
		myDrink.buyDrink();
		myDrink.getApple();
		myDrink.getCool();
		myDrink.getCrushed();
		
	}

}
