package com.Xworkz.prime.Runner;
import com.Xworkz.prime.app.Assets;
public class AssetsRunner {

	public static void main(String[] args) {
		System.out.println("Running main in AssetsRunner");
		Assets assets=new Assets("Inventory","MutualFund","Banglore" );
		Assets assets2=new Assets("Inventory", "MutualFund", "Banglore");
		boolean result=assets.equals(assets2);
		System.out.println("Assets is same:"+ result);
	}

}
