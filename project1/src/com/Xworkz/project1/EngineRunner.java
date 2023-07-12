package com.Xworkz.project1;

public class EngineRunner {

	public static void main(String[] args) {
		System.out.println("Running main in EngineRunner");
		Engine ref=new Engine();
		Engine.weight=300;
		ref.prize=77.585;
		ref.displayInstance();
	}

}
