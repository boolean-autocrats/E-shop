
package test;

import model.Product;
import model.Shop;
import myUtil.DateTools;

import java.util.ArrayList;
import java.util.List;



public class MyTest {


	public static void main(String[] args) {

		System.out.println("test2");
		// We print the current date and time.
		System.out.println(DateTools.printCurrentDateTime());
		
		// We create a shop and fill it with products, customers, etc.
		Shop myShop = new Shop();
		
		myShop.setExistingProducts(DataHelper.createSomeProducts());
		myShop.setExistingCustomers(DataHelper.createSomeCustomers());
		myShop.setExistingCoupons(DataHelper.createSomeCoupons());
		myShop.setExistingMemberships(DataHelper.createSomeMemberships());
		//myShop.setExistingCashiers(DataHelper.createSomeCashiers());

        List<Product> listOfAllProducts = new ArrayList<>();
        
        
        
        
        for(Product p:myShop.getExistingProducts()){
        	listOfAllProducts.add(p);
        }
        
        OrderCreation createOrder = new OrderCreation();
        createOrder.newOrder(listOfAllProducts);
        
        System.out.println("menu");
		
		// create a class: User and two subclasses: Employee and Customer  
		
	}
	

	
	
}
