/**
 * @(#)calculator2.java
 *
 *
 * @author
 * @version 1.00 2015/1/23
 */

import java.util.Scanner;
public class calculator2 {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int num1, num2;
    	int choice;

    	//take inputs from the user
    	System.out.print("Enter number 1: ");
    	num1 = input.nextInt();

    	System.out.print("Enter number 2: ");
    	num2 = input.nextInt();

    	System.out.print("Enter a choice\n1 Add \n2 Subtract \n3 Multiply \n4 Divide\n>");
    	choice = input.nextInt();

    	if(choice == 1){
    		System.out.println("Numbers added are: " + (num1+num2));
    	}
    	else if(choice == 2){
    		System.out.println("Numbers subtracted are: " + (num1-num2));
    	}
    	else if(choice == 3){
    		System.out.println("Numbers multipled are: " + (num1*num2));
    	}
    	else if(choice == 4){
    		System.out.println("Numbers divided are: " + (num1/num2));
    	}
    	else{
    		System.out.println("Not a valid selection");
    	}


    }//end main method


}//end class