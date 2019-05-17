package test;

import model.Product;
import model.Shop;
import myUtil.DateTools;
import java.util.ArrayList;
import java.util.List;

public class MyTest {


	public static void main(String[] args) {

		// We print the current date and time.
		System.out.println(DateTools.printCurrentDateTime());
		
		// We create a shop and fill it with products, customers, etc.
		Shop myShop = new Shop();
		
		myShop.setExistingProducts(DataHelper.createSomeProducts());
		myShop.setExistingCustomers(DataHelper.createSomeCustomers());
		myShop.setExistingCoupons(DataHelper.createSomeCoupons());
		myShop.setExistingMemberships(DataHelper.createSomeMemberships());
		//myShop.setExistingCashiers(DataHelper.createSomeCashiers());

		// Create a list that all the available products will go
        List<Product> listOfAllProducts = new ArrayList<>();

        // Insert all products to the list
        for(Product p:myShop.getExistingProducts()){
        	listOfAllProducts.add(p);
        }

        // Create a class object responsible for the Order of the products
        OrderCreation createOrder = new OrderCreation();

        // Calls the method newOrder
        //List list_ids = 
    	createOrder.newOrder(listOfAllProducts);
    	

        // Create a class object responsible for the CheckOut
        CheckOut checkOut = new CheckOut();

        //Calls the method
		checkOut.invoice();



        System.out.println("menu");

		// create a class: User and two subclasses: Employee and Customer  
		
	}
	

	
	
}
