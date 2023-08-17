package com.xworkz.dto.runner;

import com.xworkz.app.customer.CustomerDTO;
import com.xworkz.app.customer.CustomerRepository;
import com.xworkz.app.customer.CustomerRepositoryImpl;

public class CustomerDTORunner {

	public static void main(String[] args) {
		CustomerDTO customer=new CustomerDTO("Harshitha", "harshu23@gmail.com", "Udupi", false);
		System.out.println(customer.toString());
		CustomerRepository customerRepo=new CustomerRepositoryImpl();
		customerRepo.save(customer);
		
		CustomerDTO customer1=new CustomerDTO("Deepu", "Deepu25@gmail.com", "Hassan", true);
		System.out.println(customer1.toString());
		CustomerRepository customerRepo1=new CustomerRepositoryImpl();
		customerRepo1.save(customer1);
		
		CustomerDTO customer2=new CustomerDTO("Manasa", "manasa2003@gmail.com", "Arsikere", true);
		System.out.println(customer2.toString());
		CustomerRepository customerRepo2=new CustomerRepositoryImpl();
		customerRepo2.save(customer2);
		
		CustomerDTO customer3=new CustomerDTO("KalyanRam", "kalyanram@gmail.com", "Chittoor", true);
		System.out.println(customer3.toString());
		CustomerRepository customerRepo3=new CustomerRepositoryImpl();
		customerRepo3.save(customer3);
		
		CustomerDTO customer4=new CustomerDTO("Guru", "guru12@gmail.com", "Hyderabad", false);
		System.out.println(customer4.toString());
		CustomerRepository customerRepo4=new CustomerRepositoryImpl();
		customerRepo4.save(customer4);

	}

}
