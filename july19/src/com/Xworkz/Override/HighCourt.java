package com.Xworkz.Override;

public class HighCourt extends SupremeCourt {
	void criminalCase()
	{
		System.out.println("invoking criminal case in SuperCouett");
	}
	
	void forgeryCase()
	{
		System.out.println("invoking forgeryCase in SupremeCourt");
	}
	
	@Override
	void importantCase()
	{
		System.out.println("overriding important case in SuperCourt");
	}
	@Override

	 void justice()
	{
		System.out.println(" overiding justice in SuperCourt");
	}
	

}
