package test;

import java.util.List;

public class CheckOut {

    public void invoice(List<SelectedProduct> list){

        int TotalCost = 0;

        System.out.println("\n\t\t\t\t\t\t\tInvoice");
        System.out.println("\t\t\t\t\t\t\t--------\n");
        System.out.println("\t-Name-\t\t\t\t\t\t\t\t\t\t-Description-\t\t\t\t\t\t\t\t\t\t\t\t-Quantity-\t\t\t\t-Price-");
        System.out.println("\t------\t\t\t\t\t\t\t\t\t\t-------------\t\t\t\t\t\t\t\t\t\t\t\t---------\t\t\t\t-------");

        // Needs some work
        for(SelectedProduct s: list){

            System.out.printf("%-1s%-22s","", s .getName());
            System.out.printf("%-30s%-22s","", s.getDescription());
            System.out.printf("%-30s%-22s","", s.getQuantity());
            System.out.printf("%-30s%-22s","", s.getPrice());
            System.out.println("");
            TotalCost += s.getPrice() * s.getQuantity();
        }

        System.out.println("\n\n\tThe Total cost is :" + TotalCost);




    }
}
