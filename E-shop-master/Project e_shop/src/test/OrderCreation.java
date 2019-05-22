package test;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderCreation {
	
	
	private List<SelectedProduct> listOfSelectedProducts = new ArrayList<>();
	
	public OrderCreation() {
		
	}
	
	public List<SelectedProduct> newOrder(List<Product> products){
		
		Scanner input = new Scanner(System.in);
		int checkOut = products.size() + 1;
		int selectedProduct = 0;
		int i = 0;
		double convertedPrice = 0;
		
		while(true) {
			System.out.println("\t\tCreate Your Order.");
			System.out.println("\t\t------------------\n");
			System.out.println("-Code-\t\t-Name-\t\t\t\t\t-Description\t\t\t\t\t\t\t-Price-");
			System.out.println("-------\t\t--------\t\t\t\t----------------\t\t\t\t\t\t-------");
			
			for(Product s:products) {
				System.out.format("  %-13s%-40s\t%-40s\t\t\t%.02f\n",s.getCode().substring(1),s.getName(),s.getDescription(),s.getPrice().setScale(2,2));
			}
			System.out.println("\n  " + checkOut + "\t\t\tProceed to checkout");
			System.out.println("   0\t\t\tExit - Cancel Order");
		
			System.out.print("\nChoose an item to add to the basket:");
			selectedProduct = input.nextInt();
			
			if(selectedProduct == checkOut || selectedProduct == 0) {
				break;
			}
			
			int quantity = -1;
			 
			while(quantity <= 0) {
				System.out.print("Type quantity for this product:");
				quantity = input.nextInt();
			}
			
			listOfSelectedProducts.add(new SelectedProduct());
			listOfSelectedProducts.get(i).setCode(selectedProduct -1);
			listOfSelectedProducts.get(i).setName(products.get(selectedProduct -1).getName());
			listOfSelectedProducts.get(i).setDescription(products.get(selectedProduct -1).getDescription());
			listOfSelectedProducts.get(i).setQuantity(quantity);
			convertedPrice = (products.get(i).getPrice().setScale(2,2)).doubleValue();
			listOfSelectedProducts.get(i).setPrice(convertedPrice);
			listOfSelectedProducts.get(i).setTotalCost();
			
			i++;
		}
		
		return listOfSelectedProducts;
	}


}
