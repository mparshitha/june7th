package com.xworkz.app.customer;

public interface CustomerRepository {
	int TOTAL_ITEMS = 5;

	void save(CustomerDTO customer);
}
