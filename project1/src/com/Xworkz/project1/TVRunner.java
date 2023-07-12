package com.Xworkz.project1;

public class TVRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TVRunner");
		TV ref=new TV();
		TV.brand="Samsung";
		ref.prize=60000;
		ref.displayInstance();

	}

}
