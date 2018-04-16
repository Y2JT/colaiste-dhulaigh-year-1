/**
 * @(#)homework.java
 * Using the Arrays in the previous program, ask the user to enter their pin
 * If the pin is found, ask them to change their grade and pin
 * Print all the details of that user
 * @author
 * @version 1.00 2015/1/30
 */

import java.util.Scanner;
public class homework {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	String names[] = {"Bill", "Ben", "Ted", "Fred", "John"};
    	int grades[] = {30,55,90,37,62};
    	int pin[] = {123,234,345,456,567};
    	int userpin;
    	int sub =0;
    	boolean flag = false;
    	boolean code = false;
    	
    	while(flag == false){
    		System.out.print("Please enter your pin code: ");
    		userpin = input.nextInt();
    		
    		//loop to search the array for the pin
    		for(int i = 0; i<pin.length; i++){
    			if(userpin==pin[i]){
    				System.out.println("Logging in");
    				sub = i;
    				flag = true;
    				break;
    			}//end if
    		}//end for
    	}//end while
    	
    	System.out.println("Welcome " + names[sub] + ", your grade is " + grades[sub]);
    	
    	System.out.print("Please enter a new pin code: ");
    	int newpin = input.nextInt();
    	
    	System.out.print("Please enter a new grade: ");
    	int newgrade = input.nextInt();
    	
    	while(code == false){
    		System.out.print("Please enter your pin code: ");
    		newpin = input.nextInt();
    		
    		//loop to search the array for the pin
    		for(int i = 0; i<pin.length; i++){
    			if(newpin==userpin){
    				System.out.println("Logging in");
    				sub = i;
    				code = true;
    				break;
    			}//end if
    		}//end for
    	}//end while
    	
    	//print new array
    	for(int i = 0; i<grades.length;i++){
    		System.out.println("Welcome " + names[sub] + ", your grade is " + grades[sub]);
    	}










    }//end main method


}//end class