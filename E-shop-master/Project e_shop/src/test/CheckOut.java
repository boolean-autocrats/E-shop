package test;

import java.util.List;

public class CheckOut {

    public void invoice(List<SelectedProduct> list){

        double TotalCost = 0;

        System.out.println("\n\t\t\t\t\t\t\tInvoice");
        System.out.println("\t\t\t\t\t\t\t--------\n");
        System.out.println("\t-Name-\t\t\t\t\t\t\t\t\t\t-Description-\t\t\t\t\t\t\t\t\t\t\t\t-Quantity-\t\t\t\t-Price-");
        System.out.println("\t------\t\t\t\t\t\t\t\t\t\t-------------\t\t\t\t\t\t\t\t\t\t\t\t---------\t\t\t\t-------");


        for(SelectedProduct s: list){

            System.out.format("\t%-40s%-40s\t%25d\t\t\t\t\t %.02f\n", s.getName(), s.getDescription(),s.getQuantity(),s.getPrice());

            TotalCost += (s.getPrice() * s.getQuantity());
        }

        System.out.println("\n\n\tThe Total cost is : " + TotalCost + "€");


    }
}
