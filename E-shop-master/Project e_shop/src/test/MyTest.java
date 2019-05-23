package test;

import model.Product;
import model.Shop;
import myUtil.DateTools;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MyTest {


    public static void main(String[] args) {

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
        for (Product p : myShop.getExistingProducts()) {
            listOfAllProducts.add(p);
        }
        List<SelectedProduct> chosenProducts = new ArrayList<>();
        ArrayList costumersInfo = new ArrayList();

        CheckOut checkOut = new CheckOut();
        OrderCreation createOrder = new OrderCreation();
        Sign_in costumer = new Sign_in();
        Scanner input = new Scanner(System.in);


        // create a class: User and two subclasses: Employee and Customer
        //Main menu class: Program Menu..
        int selection;
        boolean Flag = false;
        while (true) {
            //Printing_the_stuff..
            //Printing the log_status of the user
            if (Flag == false) {
                System.out.println("---------E-shop Selections---------\n\t   You aren't Signed-in!!!");
            } else {
                System.out.println("---------E-shop Selections---------\n\tWelcome " + costumersInfo.get(0) + " " + costumersInfo.get(1) + "!");
            }
            System.out.println("------>" + DateTools.printCurrentDateTime() + "<--------\n");   //Date_and_time..

            System.out.println("1)Items List");
            System.out.println("2)CheckOut");
            System.out.println("3)Sign in");
            System.out.println("0)Exit\n");


            //value grabber
            System.out.print("Give me your selection :");

            while (true) {
                try {
                    selection = input.nextInt();
                    if (selection >= 0 && selection <= 3) {
                        break;
                    } else {
                        System.out.print("Give a number between 0-3 :");
                    }
                } catch (InputMismatchException ex) {
                    input.next();
                    System.out.print("Incorrect value :");
                }
            }

            //if_classes..

            if (selection == 1) {
                chosenProducts.addAll(createOrder.newOrder(listOfAllProducts));
            } else if (selection == 2) {
                if (Flag == true || listOfAllProducts.isEmpty()) { //problem..
                    checkOut.invoice(chosenProducts);
                    break;
                } else {
                    System.out.println("You need to sign up First!!");
                }
            } else if (selection == 3) {
                //making the costumers information
                Flag = true;
                costumersInfo = costumer.signInProcess();
            } else {  //selection == 0 (Exit)
                System.out.println("Thanks for coming!");
                break;
            }
        }

    }


}
