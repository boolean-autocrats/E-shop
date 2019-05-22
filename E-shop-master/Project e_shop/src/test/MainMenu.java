/**
 * @author Alehandro.. :p
 * 
 */
package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class MainMenu {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int selection;

        //printing_the_stuff..
        System.out.println("---------E-shop Selections---------\n");

        System.out.println("1)Product List..");
        System.out.println("2)Chech out");
        System.out.println("3)Sign in");
        System.out.println("0)Exit\n");


        //value grabber
        System.out.print("Give me your selection :");

        while(true){
            try {
                selection = input.nextInt();
                if(selection >= 0 && selection <=3){
                    break;
                }else{
                    System.out.print("Give a number between 0-3 :");
                }
            } catch (InputMismatchException ex) {
                input.next();
                System.out.print("Incorrect value :");
            }
        }

        //if_classes..

        if(selection == 1){

        }else if(selection == 2){

        }else if(selection == 3){

        }else{  //selection == 0 (Exit)
            System.out.println("Thanks for coming!");
        }
        
    }
}
