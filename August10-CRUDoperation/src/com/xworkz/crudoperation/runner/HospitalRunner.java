package com.xworkz.crudoperation.runner;
import com.xworkz.crudoperation.app.hospital.HospitalRepository;
import com.xworkz.crudoperation.app.hospital.HospitalRepositoryImpl;
public class HospitalRunner {

	public static void main(String[] args) {
System.out.println("Running main in Hospital Runner\n");
		
		HospitalRepository repository = new HospitalRepositoryImpl();
		repository.save("Nimhans");
		repository.save("Appolo");
		repository.save("Meghan");
		repository.save("Manipal");
		repository.save("Aryan");

		System.out.println("**************************");
		
		repository.display();

	}

}
