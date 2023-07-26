package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		Dosa dosa=new Dosa();
		System.out.println(dosa);
		dosa.setName("OnionDosa");
		dosa.setPrice(15);
		dosa.setType(40);
		dosa.setShape("Triangle");
		dosa.setColor("white");
		System.out.println(dosa.toString());

	}

}
