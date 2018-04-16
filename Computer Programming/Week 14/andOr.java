/**
 * @(#)andOr.java
 * Ask the user for 2 numbers between 1 and 10
 * See if they can guess what number is generated
 *
 * @author
 * @version 1.00 2015/1/23
 */

import java.util.Scanner;
public class andOr {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int num1, num2, usernum1, usernum2;

    	//generate numbers
    	num1 = 1 + (int)(Math.random()*10);
    	num2 = 1 + (int)(Math.random()*10);

    	//take user input
    	System.out.print("Enter number 1 (1-10): ");
    	usernum1 = input.nextInt();

    	System.out.print("Enter number 2 (1-10): ");
    	usernum2 = input.nextInt();

    	//check if user guessed the 2 numbers correctly
    	if(usernum1 == num1 && usernum2 == num2){
    		System.out.println("You got both numbers correct");
    	}
    	else if(usernum1 == num1 || usernum2 == num2){
    		System.out.println("You got one number correct");
    	}
    	else{
    		System.out.println("You got none of the numbers correct");
    	}

    }//end main method


}//end class