package com.Xworkz.prime.Runner;

import com.Xworkz.prime.app.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		NewsPaper newspaper=new NewsPaper();
		System.out.println(newspaper);
		newspaper .setBrand(20);
		newspaper .setPrice(5);
		newspaper .setName("Deccan Herald");
		newspaper .setTypes(5);
		newspaper .setnoOfPages(12);
		System.out.println(newspaper.toString());
	}

}
