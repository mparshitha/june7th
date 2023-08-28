package com.xworkz.customer.runner;

import java.time.LocalDateTime;

public class LocalDateRunner {
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime "+localDateTime);
		LocalDateTime past=LocalDateTime.of(2010, 03, 23, 10, 45);
		System.out.println("past "+past);
		LocalDateTime future=LocalDateTime.of(2023, 12, 26, 11, 56);
		System.out.println("Future "+future);
		boolean check = localDateTime.isAfter(past);
		System.out.println("Check :"+check);
		boolean check2 = localDateTime.isBefore(past);
		System.out.println(check2);
		boolean check3 = localDateTime.isEqual(past);
		System.out.println(check3);
		
		
		
		
	
			
	}
}
