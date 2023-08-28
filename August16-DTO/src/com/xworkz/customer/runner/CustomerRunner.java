package com.xworkz.customer.runner;

import com.xworkz.customer.Dto.CustomerDTO;
import com.xworkz.customer.repo.CustomerRepository;
import com.xworkz.customer.repo.CustomerRepositoryImpl;

public class CustomerRunner {

	public static void main(String[] args) {
		CustomerDTO dto = new CustomerDTO("Vishmitha", "vishmithagowda23@gmail.com", "Hassan", false);
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		customerRepository.save(dto);
		System.out.println("----------------------------");
		customerRepository.findByName("Vishmitha");

	}

}
