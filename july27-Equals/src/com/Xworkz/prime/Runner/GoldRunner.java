package com.Xworkz.prime.Runner;
import com.Xworkz.prime.app.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("Running main in GoldRunner");
		Gold gold=new Gold("Aurelia","Vermeil","SRS", 5000 );
		Gold gold2=new Gold("Gilda", "BlackGold", "Roopa", 5000);
		boolean result=gold.equals(gold2);
		System.out.println("Gold is same:"+ result);
	}

}
