package com.Xworkz.prime.runner;
import com.Xworkz.prime.app.Ladoo;

public class LadooRunner {

	public static void main(String[] args) {
System.out.println("Running in main");
		
		Ladoo ladoo=new Ladoo();
		System.out.println(ladoo);//print toString implicit
		
		Ladoo ladoo2=new Ladoo();
		System.out.println(ladoo2.toString());//print toString explicit

	
	}

}
