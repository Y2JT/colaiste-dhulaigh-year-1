/**
 * @(#)flagNumbers.java
 * Generate 5 numbers between 1-5, store them in an array
 * Ask the user for a number between 1 and 5, tell them if its in the array
 * Check for inputs from 1 to 5
 *
 * @author
 * @version 1.00 2015/1/28
 */

import java.util.Scanner;
public class flagNumbers {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int nums[] = new int[5];
    	int usernum;
    	String strusernum;
    	boolean flag = false;

    	//generate random number
    	for(int i = 0; i<nums.length; i++){
    		nums[i] = 1 + (int)(Math.random()*5);
    	}

		//take a number from the user
		System.out.print("Enter a number from 1-5: ");
		strusernum = input.next();

		//validate number
		while(!strusernum.matches("[1-5]")){
    		System.out.println("Error, 1-5 can only be entered");
    		System.out.print("Enter a number from 1-5: ");
    		strusernum = input.next();
		}//end while

		//change to int
		usernum = Integer.parseInt(strusernum);

		//check if number is in the array
		for(int i = 0; i<nums.length;i++){
		if(usernum==nums[i]){
			flag = true;
			System.out.println("Your number is in the array");
			break;
		}//end if
	}//end for

		//check if flag still false
		if(flag == false){
			System.out.println("Number not in the array");
		}//end if

    }//end main method


}//end class