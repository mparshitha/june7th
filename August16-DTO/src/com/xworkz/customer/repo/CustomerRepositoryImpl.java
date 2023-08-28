package com.xworkz.customer.repo;

import com.xworkz.customer.Dto.CustomerDTO;

public class CustomerRepositoryImpl implements CustomerRepository {


	CustomerDTO[] customerDTOs = new CustomerDTO[TOTAL_COUNT];

	int index = 0;

	@Override
	public void save(CustomerDTO dto) {
		if(this.index<TOTAL_COUNT) {
			this.customerDTOs[index] = dto;
			System.out.println(dto);
			index++;
		}
		else {
			System.err.println("Index limit exceeded, Cannot store more data");
		}
	}

	public CustomerDTO findByName(String name) {
		
		int customerDTOs[] = null;
		for(int i = 0;i<customerDTOs.length;i++)
		{
		if(customerDTOs.equals(name)) {
			this.index=1;
			System.out.println("");
		}
		{
			System.out.println("");
		}
	
	}
		return null;
	}
}
