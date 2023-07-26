package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.HeadSet;

public class HeadSetRunner {

	public static void main(String[] args) {
		HeadSet headset=new HeadSet();
		System.out.println(headset);
		headset .setBrand("Boat");
		headset .setPrice(250);
		headset .setName("JBL");
		headset .setColor("Black");
		headset .setTypes(2000);
		System.out.println(headset.toString());

	}

}
