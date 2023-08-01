package com.Xworkz.implementation;

import com.Xworkz.abstractclass.FashionItem;

public class Clothing extends FashionItem {
	public final void wear() {
		System.out.println("Clothing item worn.");
	}

	@Override
	public void display() {
		System.out.println("Clothing item displayed.");
	}
}
