/**
 * @(#)changingArrays.java
 *
 *
 * @author
 * @version 1.00 2015/1/30
 */

import java.util.Scanner;
public class changingArrays {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	String names[] = {"Bill", "Ben", "Ted", "Fred", "John"};
    	int grades[] = {30,55,90,37,62};
    	int pin[] = {123,234,345,456,567};
    	int userpin;	//pin entered by user
    	int sub =0;		//hold the position of the person in the array
    	boolean flag = false;	//used to see if we have found the userpin

    	//while we have not found the userpin (pin entered by the user)
    	while(flag == false){
    		//prompt user
    		System.out.print("Enter your pin: ");
    		//take userpin
    		userpin = input.nextInt();

    		//loop to search the array for the pin
    		for(int i = 0; i<pin.length;i++){
    			//check if userpin eqauls pin[i]
    			if(userpin==pin[i]){
    				System.out.println("Pin found");
    				//hold onto the position of the person in the array
    				sub = i;
    				//change value of the flag to indicate we have found the user
    				flag = true;
    				break;		//stops searching the array
    			}//end if
    		}//end for

    	}//end while

    	System.out.println("Welcome " + names[sub] + ", your grade is " + grades[sub]);










    }//end main method


}//end class