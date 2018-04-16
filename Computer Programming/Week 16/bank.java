/**
 * @(#)bank.java
 * Ask a user to login and then print their details
 * Give the user a menu to
 * 1) Lodge
 * 2) Withdraw
 * 3) Exit
 * The user cannot withdraw any more than is in their account
 * Keep showing the menu until the user chooses to quit
 * Validate all inputs
 * @version 1.00 2015/2/6
 */

import java.util.Scanner;
import java.util.Date;
public class bank {

    public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
    	int balance[] = {100,200,300};
    	String name[] = {"Fred","Ted","John"};
    	int pins[] = {123,234,345};
    	int userpin;
    	String struserpin;
    	String strlodge;
    	String strwithdraw;
    	boolean found = false;
    	int sub = 0;
    	int choice = 0, lodge = 0, withdraw = 0, userbalance = 0;
    	
    	Date d = new Date();
    	System.out.println(d);
    	System.out.println();	//print blank line

		//ask the user for the pin
		System.out.print("Enter Pin: ");
		struserpin = input.next();

		//validate the pin
		while(!struserpin.matches("\\d{3}")){
			System.out.println("Error, 3 digits only");
			System.out.print("Enter pin: ");
			struserpin = input.next();
		}//end while
		//parse the pin
		userpin = Integer.parseInt(struserpin);

		//check if the pin is in the array
		for(int i = 0; i<pins.length; i++){
			if(userpin==pins[i]){
				System.out.println("\n********************");
				System.out.println("     PIN FOUND     ");
				System.out.println("********************");
				found = true;
				//hold onto value of i
				sub = i;
				//stop searching the loop
				break;
			}//end if
		}//end for

		if(found == false){
			java.awt.Toolkit.getDefaultToolkit().beep();
			System.out.println("\nPin was not found, process ending.");
			//end the program
			System.exit(0);
		}//end if
		if(found == true){
			System.out.println("\nWelcome to Charisma Banking, " + name[sub]);
			System.out.println("\nYour current balance is: " + balance[sub]);
		}//end if
		System.out.println("\n********** Charisma Banking Main Menu **********");
		//show menu
		while(choice!=3){
			System.out.print("\nWhat would you like to do?\n1) Lodge \n2) Withdraw \n3) Exit\n>");
			choice = input.nextInt();
			//choice 1
			if(choice==1){
				System.out.print("\nPlease enter the amount you would like to lodge: ");
				strlodge = input.next();
				//check for non digits
				while(!strlodge.matches("\\d+")){
					System.out.println("ERROR: NUMBERS ONLY");
					System.out.print("\nPlease enter the amount you would like to lodge: ");
					strlodge = input.next();
				}//end validation
				//parse int
				lodge = Integer.parseInt(strlodge);
				System.out.println("\nYou have lodged: " + lodge + " \nYour new balance is: " + (balance[sub]+=lodge));
			}//end choice 1
			else if(choice==2){
				System.out.print("\nPlease enter the amount you would like to withdraw: ");
				strwithdraw=input.next();
				//check for non digits
				while(!strwithdraw.matches("\\d+")){
					System.out.println("ERROR: NUMBERS ONLY");
					System.out.print("\nPlease enter the amount you would like to withdraw: ");
					strwithdraw = input.next();
				}//end validation
				//parse int
				withdraw = Integer.parseInt(strwithdraw);
				if((balance[sub]-withdraw)<0){
            	System.out.println("\t\tERROR INSUFFICIENT FUNDS");
            	System.out.print("Please enter the amount you would like to withdraw: ");
				strwithdraw=input.next();
				//check for non digits
				while(!strwithdraw.matches("\\d+")){
					System.out.println("ERROR: NUMBERS ONLY");
					System.out.print("Please enter the amount you would like to withdraw: ");
					strwithdraw = input.next();
				}//end validation
				//parse int
				withdraw = Integer.parseInt(strwithdraw);
            	}//end if
				System.out.println("\nYou have withdrawn: " + withdraw + " \nYour new balance is: " + (balance[sub]-=withdraw));
			}//end choice 2
		}//end while

		System.out.println("\nThank you for using Charisma Bank. Process ending.");
		System.out.println();	//print blank line

    }//end main method


}//end class