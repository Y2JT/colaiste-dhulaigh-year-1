/**
 * @(#)Assignment2.java
 * @ Joseph Tierney
 * @version 1.00 2015/3/9
 */

import java.util.Scanner;
import java.util.Date;
public class Assignment2 {

    public static void main(String args[]) {

    	//declare variables
    	Scanner input = new Scanner(System.in);
    	int points[] = {2100,550,3500,200,650};
    	String customers[] = {"Joey","Stephanie","Renee","Zack","Dean"};
    	int pins[] = {1234,5678,9012,3456,7890};
    	int giftpoints[] = {3000,400,1400,100,500000};
    	String shopgifts[] = {"PS4 Game","Gift Voucher","iPod Touch","Empty Box","iPhone 6"};
    	int addpoints = 0, pin =0, pin2=0, choice=0, option=0, gifts=0,giftchoice=0;
    	boolean found = false;
    	int sub = 0;
    	String strchoice;
    	String stroption;
    	String strpin;
    	String strgifts;
    	String straddpoints;
    	String strpin2;
    	String strgiftchoice;
    	String strusername;
    	String username;
    	String menu = "\nWhat would you like to do?\n1) View Gifts \n2) Buy Gifts \n3) Add Points \n4) Change Pin \n5) Exit\n>";
    	String loginm = "\n1) Log In \n2) Exit\n>";
    	Date d = new Date();

    	//welcome user
    	System.out.println(d);
    	System.out.print("\n*** Welcome to Ambrose Market *** " + loginm);
    	stroption = input.next();

    	//validate the input
    	while(!stroption.matches("[1-2]")){
    		System.out.println("\nERROR: Numbers 1 - 2 only");
    		java.awt.Toolkit.getDefaultToolkit().beep();
    		//reprompt the user
    		System.out.print(loginm);
    		stroption = input.next();
    	}//end while

    	//parse int
    	option = Integer.parseInt(stroption);

    	//if user inputs 2
    	if(option==2){
    		System.out.println("\nProcess Ending...");
    		System.out.println();
    		System.exit(0);
    	}//end if

    	else if(option==1){
    		//prompt user for username
    		System.out.print("\nPlease enter your username: ");
    		username = input.next();

    		//check if name is in the array
    		for(int i =0;i<customers.length;i++){
    			if(customers[i].matches((username))){
    				System.out.print("\n*** USERNAME FOUND ***");
    				System.out.println();	//print blank line
    				sub = i;
    				found = true;
    			}//end if
    		}//end for

    		//check if found is still false
    		if(found==false){
    			System.out.println("\nUsername was not found, process ending...");
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			System.out.println();	//print blank line
    			System.exit(0);
    		}//end if

			//reset found to false
    		found = false;

    		//prompt user for pin
    		System.out.print("\nPlease enter your pin code: ");
    		strpin = input.next();

    		//validate pin code
    		while(!strpin.matches("\\d{4}")){
    			System.out.println("\nERROR: 4 DIGITS ONLY");
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			//reprompt user
    			System.out.print("\nPlease enter your pin code: ");
    			strpin = input.next();
    		}//end while

    		//parse int
    		pin = Integer.parseInt(strpin);

    		//check if pin code is in array
    		for(int i =0; i<pins.length; i++){
    			if(pins[sub]==pin){
    				System.out.print("\n*** PIN FOUND ***");
    				System.out.println();	//print blank line
    				//change found to true
    				found = true;
    				break;
    			}//end if
    		}//end for
    	}//end else if

    	//check if found is still false
    	if(found==false){
    		System.out.println("\nPin was not found, process ending...");
    		java.awt.Toolkit.getDefaultToolkit().beep();
    		System.out.println();	//print blank line
    		System.exit(0);
    	}//end if

    	System.out.println("\nWelcome " + customers[sub] + ". \nYour Value Gift Points are: " + points[sub]);

    	//show menu
    	while(choice!=5){
    		System.out.print(menu);
    		strchoice = input.next();

    		//validate input
    		while(!strchoice.matches("[1-5]")){
    			System.out.println("\nERROR: Enter 1-5 only!");
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			System.out.print(menu);
    			strchoice = input.next();
    		}//end while
    		//parse int
    		choice = Integer.parseInt(strchoice);

    		//choices
    		if(choice==1){
    			System.out.print("\nThe following gifts available are: ");
    			System.out.print("\n-----------------------------------");
    			System.out.print("\nGift ID\t\tGift\t\t\tPoints");
    			for(int i = 0; i<shopgifts.length; i++){
    				System.out.print("\n" + (i+1) + "\t\t" + shopgifts[i] + "\t\t" + giftpoints[i]);
    			}//end for
    			System.out.println();	//print blank line
    		}//end choice 1
    		else if(choice==2){
    			System.out.println("\nREMINDER: Your points are: " + points[sub]);
    			System.out.print("\nGift ID\t\tGift\t\t\tPoints");
    			for(int i=0;i<shopgifts.length;i++){
    				System.out.print("\n" + (i+1) + "\t\t" + shopgifts[i] + "\t\t" + giftpoints[i]);
    			}//end for
    			System.out.println();	//print blank line
    			System.out.print("\nWhich gift would you like to purchase?");
    			System.out.print("\nEnter Here: ");
    			strgiftchoice = input.next();
    			//validate input
    			while(!strgiftchoice.matches("[1-5]")){
    				System.out.println("\nERROR: Enter 1-5 only!");
    				java.awt.Toolkit.getDefaultToolkit().beep();
    				System.out.print("\nGift ID\t\tGift\t\t\tPoints");
    				for(int i=0;i<shopgifts.length;i++){
    					System.out.print("\n" + (i+1) + "\t\t" + shopgifts[i] + "\t\t" + giftpoints[i]);
    				}//end for
    				System.out.print("\nWhich gift would you like to purchase?");
    				System.out.print("\nEnter Here: ");
    				strgiftchoice = input.next();
    			}//end validation
    			//check for non-digits
    			while(!strgiftchoice.matches("\\d+")){
    				System.out.println("ERROR: NUMBERS ONLY");
    				java.awt.Toolkit.getDefaultToolkit().beep();
    				//reprompt user
    				System.out.print("\nWhich gift would you like to purchase?");
    				System.out.print("\nEnter Here: ");
    				strgiftchoice = input.next();
    			}//end while
    			//parse int
    			giftchoice = Integer.parseInt(strgiftchoice);
    			if(points[sub] >= giftpoints[giftchoice-1]){
    				points[sub] -= giftpoints[giftchoice-1];
    				System.out.print("\nPurchase of " + shopgifts[giftchoice-1] + " Successful. \n Points remaining: " + points[sub]);
    				System.out.println();
    			}//end if
    			else{
    				System.out.println("ERROR: NOT ENOUGH POINTS");
    				java.awt.Toolkit.getDefaultToolkit().beep();
    			}//end else
    		}//end choice 2
    		else if(choice==3){
    			System.out.print("\nHow many points would you like to add?");
    			System.out.print("\nEnter Amount Here: ");
    			straddpoints = input.next();
    			//check for non-digits
    			while(!straddpoints.matches("\\d+")){
    				System.out.println("ERROR: NUMBERS ONLY");
    				java.awt.Toolkit.getDefaultToolkit().beep();
    				//reprompt user
    				System.out.print("\nHow many points would you like to add?");
    				System.out.print("\nEnter Amount Here: ");
    				straddpoints = input.next();
    			}//end while
    			//parse int
    			addpoints = Integer.parseInt(straddpoints);
    			System.out.println("\nYou have added " + addpoints + " points. \nYour new point balance is " + (points[sub]+=addpoints));
    		}//end choice 3
    		else if(choice==4){
    			System.out.print("\nEnter your new pin: ");
    			strpin2=input.next();
    			//validate pin code
    			while(!strpin2.matches("\\d{4}")){
    			System.out.println("ERROR: 4 DIGITS ONLY");
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			//reprompt user
    			System.out.print("\nEnter your new pin: ");
    			strpin2 = input.next();
    		}//end while
    		//parse int
    		pin2 = Integer.parseInt(strpin2);
    		//set found to true
    		found = true;
    			//check if pin already exists
    			for(int i=0;i<pins.length;i++){
    				if(pin2==pins[i]){
    					System.out.println("\n*** PIN ALREADY IN USE ***");
    					java.awt.Toolkit.getDefaultToolkit().beep();
    					//change found to false
    					found = false;
    				}//end if
    			}//end for
    			//check if found is true
    			if(found==true){
    				pins[sub] = pin2;
    				System.out.println("\nPin was successfully changed!");
    				System.out.println("Your new pin is: " + pins[sub]);
    			}//end if
    		}//end choice 4
    	}//end while

    	System.out.println("\nThank you for using Ambrose Market.");
    	System.out.println("Program ending...");
    	System.out.println();	//print blank line

    }//end main method


}//end class