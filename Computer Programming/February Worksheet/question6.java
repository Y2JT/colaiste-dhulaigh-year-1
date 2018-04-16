/**
 * @(#)question6.java
 * Write a program and have the following array: int numbers[] = {234,432,333};
 * Ask the user to enter a 3 digit number they think might be lower than all in the array
 * and a 3 digit number that might be higher than what is in the array
 * Check that the user is entering 3 digits
 * Tell the user they guessed correctly
 *
 * @author 
 * @version 1.00 2015/2/24
 */

import java.util.Scanner;
public class question6 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int numbers[] = {234,432,333};
    	int highnum;
    	String strhighnum;
    	int lownum;
    	String strlownum;
    	
    	//prompt user for number
    	System.out.print("Enter a 3 digit number (You think will be higher): ");
    	strhighnum = input.next();
    	
    	//validate number
    	while(!strhighnum.matches("\\d{3}")){
    		System.out.println("ERROR: 3 DIGITS ONLY");
    		System.out.print("Enter a 3 digit number (You think will be higher): ");
    		strhighnum = input.next();
    	}//end while
    	
    	//parse int
    	highnum = Integer.parseInt(strhighnum);
    	
    	//prompt use for another number
    	System.out.print("Enter a 3 digit number (You think will be lower): ");
    	strlownum = input.next();
    	
    	//validate number
    	while(!strlownum.matches("\\d{3}")){
    		System.out.println("ERROR: 3 DIGITS ONLY");
    		System.out.print("Enter a 3 digit number (You think will be lower): ");
    		strlownum = input.next();
    	}//end while
    	
    	//parse int
    	lownum = Integer.parseInt(strlownum);
    	
    	//check if numbers entered are higher or lower than the arrary
    	for(int i = 0; i<numbers.length;i++){
    		if(highnum>numbers[i] && lownum<numbers[i]){
    			System.out.println("You guessed correctly!");
    			break;
    		}//end if
    		else{
    			System.out.println("\nNope, sorry!");
    		}//end else
    	}//end for
    	
    	System.out.println();
    	
    }//end main method
    
    
}//end class