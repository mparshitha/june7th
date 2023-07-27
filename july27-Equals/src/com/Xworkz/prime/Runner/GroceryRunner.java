package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GroceryRunner");
		Grocery grocery=new Grocery("Reliance","Vegitables");
		Grocery grocery2=new Grocery("Megamart", "Fruits");
		boolean result=grocery.equals(grocery2);
		System.out.println("Grocery is good:"+ result);
		
	}
}
