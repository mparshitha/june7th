package com.Xworkz.prime.Runner;
import com.Xworkz.prime.app.Calculator;
public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator);
		calculator.setName("CASIO");
		calculator.setPrice(1250);
		calculator.setShape("Rectangle");
		calculator.setColor("Black");
		calculator.setTypes(3);
		System.out.println(calculator.toString());
	}

}
