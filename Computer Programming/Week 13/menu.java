/**
 * @(#)menu.java
 *
 * Have a menu that will keep looping back around until the user chooses to quit
 *
 * @version 1.00 2015/1/14
 */

import java.util.Scanner;
import java.util.Date;
public class menu {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int choice = 0;		//choice of 1,2,3 for the menu
    	int num1, num2;

    	Date d = new Date();
    	System.out.println(d);

    	//start by showing the menu
    	while(choice != 3){
    		System.out.print("\n\nSelect an option\n1) Add \n2) Subtract\n3) Exit\n>");
    		//take an input from the user
    		choice = input.nextInt();

    		//if choice is 1
    		if(choice == 1){
    			System.out.print("Enter number 1: ");
    			num1=input.nextInt();
    			System.out.print("Enter number 2: ");
    			num2=input.nextInt();
    			System.out.println("Numbers added = " + (num1+num2));
    		}//end if choice == 1
    		else if(choice == 2){
    			System.out.print("Enter number 1: ");
    			num1=input.nextInt();
    			System.out.print("Enter number 2: ");
    			num2=input.nextInt();
    			System.out.println("Numbers subtracted = " + (num1-num2));
    		}//end if choice == 2

    	}//end while

    	System.out.println("You chose to quit, Program ending");

    }//end main method


}//end class