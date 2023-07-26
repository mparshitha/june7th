package com.Xworkz.prime.runner;
import com.Xworkz.prime.app.Lake;
public class LakeRunner {

	public static void main(String[] args) {
		System.out.println("Running in main");
		Lake lake=new Lake();
		System.out.println(lake);
		
		Object object1=new Lake();
		System.out.println(object1.toString());
	}

}
