package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Sign_in {

    ArrayList costumerInfo = new ArrayList();
    int costumerId = 0;

    public Sign_in() {

    }

    public ArrayList signInProcess() {
        Scanner input = new Scanner(System.in);
        costumerId++;
        costumerInfo.clear();

        //main code..!
        System.out.println("\n---------Sign In Process---------\n");

        System.out.print("Give me your First Name :");
        costumerInfo.add(input.nextLine());

        System.out.print("Give me your Last Name :");
        costumerInfo.add(input.nextLine());

        System.out.print("Give me your Full Address :");
        costumerInfo.add(input.nextLine());

        // Bug
        System.out.print("Give me your Phone Number :");
        while (true) {
            try {
                costumerInfo.add(input.nextLong());
                break;
            } catch (Exception ex) {
                input.next();
                System.out.print("You need to type a Phone :");
            }
        }

        costumerInfo.add(costumerId);

        return costumerInfo;
    }
}