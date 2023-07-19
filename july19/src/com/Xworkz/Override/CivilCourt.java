package com.Xworkz.Override;

public class CivilCourt extends HighCourt{
	void propertyCase()
	{
		System.out.println("invoking propertCase in HighCourt");
	}

	
	void theftCase()
	{
		System.out.println("invoking theftCase in HighCourt ");
	}
	
	
	@Override
	void criminalCase()
	{
		System.out.println("overriding criminal case in civilCourt");
	}
	
	@Override
	void forgeryCase()
	{
		System.out.println("overiding forgeryCase in CivilCourt");
	}
	
	@Override
	void importantCase()
	{
		System.out.println("overriding important case in CivilCourt");
	}
	@Override

	 void justice()
	{
		System.out.println(" overiding justice in CiviCourt");
	}
	
}
