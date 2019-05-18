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
		int totalChoices = products.size() + 1;
		int selectedProduct = 0;
		int i = 0;
		double convertedPrice = 0;
		
		while(true) {
			System.out.println("\t\tCreate Your Order.");
			System.out.println("\t\t------------------\n");
			System.out.println("-Code-\t\t\t-Name-\t\t\t\t-Description\t\t\t-Price-");
			System.out.println("-------\t\t\t------\t\t\t\t------------\t\t\t-------");
			
			for(Product s:products) {
				System.out.print("  " + s.getCode().substring(1));
				System.out.printf("\t%27s",s.getName());
				System.out.printf("\t%45s", s.getDescription());
				System.out.println("\t" + s.getPrice().setScale(2,2));
			}
			System.out.println("\n  " + totalChoices + "\t\t\tProceed to checkout");
			System.out.println("   0\t\t\tExit - Cancel Order");
		
			System.out.print("\nSelect one Product at a time:");
			selectedProduct = input.nextInt();
			
			if(selectedProduct == totalChoices || selectedProduct == 0) {
				break;
			}
			
			int quantity = -1;
			 
			while(quantity <= 0) {
				System.out.print("Type quantity for this product:");
				quantity = input.nextInt();
			}
			
			listOfSelectedProducts.add(new SelectedProduct());
			listOfSelectedProducts.get(i).setCode(selectedProduct);
			listOfSelectedProducts.get(i).setName(products.get(selectedProduct).getName());
			listOfSelectedProducts.get(i).setDescription(products.get(selectedProduct).getDescription());
			listOfSelectedProducts.get(i).setQuantity(quantity);
			convertedPrice = (products.get(i).getPrice().setScale(2,2)).doubleValue();
			listOfSelectedProducts.get(i).setPrice(convertedPrice);
			listOfSelectedProducts.get(i).setTotalCost();
			
			i++;
		}
		
		return listOfSelectedProducts;
	}


}
