package com.Xworkz.Override;

public class FamilyCourt extends CivilCourt{
	void divorceCase()
	{
		System.out.println("invoking divorceCase in FamilyCourt ");
	}
		
		@Override
		void propertyCase()
		{
			System.out.println("overiding properCase in FamilyCourt");
		}

		@Override
		void theftCase()
		{
			System.out.println("overiding theftCase in FamilyCourt ");
		}
		
		
		@Override
		void criminalCase()
		{
			System.out.println("overriding criminal case in FamilyCourt ");
		}
		
		@Override
		void forgeryCase()
		{
			System.out.println("overiding forgeryCase in FamilyCourt ");
		}
		
		@Override
		void importantCase()
		{
			System.out.println("overriding important case in FamilyCourt ");
		}
		@Override

		 void justice()
		{
			System.out.println(" overiding justice in FamilyCourt ");
		}
}
