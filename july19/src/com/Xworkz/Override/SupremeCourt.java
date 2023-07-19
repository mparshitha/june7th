package com.Xworkz.Override;

public class SupremeCourt extends Court {
	void importantCase()
	{
		System.out.println("invoking importanceCase in SupremeCourt");
	}
	
	@Override                  // Annotation  
   void justice()
	{
		System.out.println("ovriding justice method in supremecourt");
	}
}
