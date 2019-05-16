package test;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

import model.Product;

public class OrderCreation {
	
	private LinkedHashMap<String, String> listOfSelectedProducts = new LinkedHashMap<>();
	
	public void OrderCreation() {
		
	}
	
	public LinkedHashMap<String, String> newOrder(List<Product> products){
		
		
		Scanner input = new Scanner(System.in);
		int saveSelections = products.size() + 1;
		int selection = 0;
		boolean emptyValueCheck = true;
		
		while(emptyValueCheck) {
			System.out.println("\t\tCreate Your Order.");
			System.out.println("\t\t------------------\n");
			System.out.println("-Code-\t\t-Name-\t\t\t\t-Price-");
			System.out.println("-------\t\t-------\t\t\t\t-------");
			
			for(Product s:products) {
				System.out.print("  " + s.getCode().substring(1) + "\t\t" + s.getName());
				System.out.printf("\t\t\t%f2.0\n" , s.getPrice());
			}
		
			System.out.print("\nSelect one Product at a time:");
			emptyValueCheck = input.hasNextLine();
			selection = input.nextInt();
			
			if(selection == saveSelections || selection == 0) {
				break;
			}
			
			
		}
		
		System.out.println(selection);
		
		
		return listOfSelectedProducts;
	
	}


}
