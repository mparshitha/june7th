package com.Xworkz.prime.runner;
import com.Xworkz.prime.app.Finance;
public class FinanceRunner {

	public static void main(String[] args) {
		System.out.println("Running in main");
		Finance finance=new Finance();
		System.out.println(finance);
		
		Object object1=new Finance();
		System.out.println(object1.toString());
	}
	}
