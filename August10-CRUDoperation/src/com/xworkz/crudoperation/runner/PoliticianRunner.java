package com.xworkz.crudoperation.runner;
import com.xworkz.crudoperation.app.politician.PoliticianRepositry;
import com.xworkz.crudoperation.app.politician.PoliticianRepositryImpl;
public class PoliticianRunner {

	public static void main(String[] args) {
System.out.println("Running main in Politician Runner\n");
		
		PoliticianRepositry repository =  new PoliticianRepositryImpl();
		repository.save("DKS");
		repository.save("Pradeep");
		repository.save("Prathap");
		repository.save("HDK");
		repository.save("Manoj");
		
		System.out.println("**************************");
		
		repository.display();
		
	System.out.println("==========================");
		String[] ref=repository.findStartswith("Pra");
		for (int i = 0; i < ref.length; i++) {
			String name = ref[i];
			if (name!=null) {
				System.out.println("String "+name);
			}
		}
		
	}

}
