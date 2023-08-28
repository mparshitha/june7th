package com.xworkz.customer.repo;

import com.xworkz.customer.Dto.CustomerDTO;

public interface CustomerRepository {
	int TOTAL_COUNT = 5;

	 void save(CustomerDTO dto);

	CustomerDTO findByName(String name);

}
