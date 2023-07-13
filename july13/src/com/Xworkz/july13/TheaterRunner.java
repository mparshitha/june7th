package com.Xworkz.july13;

public class TheaterRunner {

	public static void main(String[] args) 
	{
		Theater ref=new Theater("Pruthvi");
		ref.theaterType(TheaterType.Tragedy);
		ref.ticketprice=200;
		ref.display();
		
		Theater ref1=new Theater("Sayadri");
		ref1.theaterType(TheaterType.Proscenium);
		ref1.ticketprice=300;
		ref1.display();

	}

}
