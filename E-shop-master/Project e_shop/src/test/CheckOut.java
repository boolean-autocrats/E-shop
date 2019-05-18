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
            System.out.printf("\t" + s.getName());
            System.out.printf("\t\t\t\t\t\t" + s.getDescription());
            System.out.printf("\t\t\t\t\t\t\t\t" + s.getQuantity());
            System.out.printf("\t\t\t\t\t " + s.getPrice());

            TotalCost += s.getPrice() * s.getQuantity();
        }

        System.out.println("\n\n\tThe Total cost is :" + TotalCost);




    }
}
