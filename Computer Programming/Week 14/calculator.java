/**
 * @(#)calculator.java
 * Take 2 numbers from the user and an operand. Calculate the result
 *
 * @author
 * @version 1.00 2015/1/23
 */

import java.util.Scanner;
public class calculator {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int num1, num2;
    	int total = 0;
    	String operand;

    	//take input from user
    	System.out.print("Enter first number: ");
    	num1 = input.nextInt();

    	System.out.print("Enter second number: ");
    	num2 = input.nextInt();

    	System.out.print("Enter +, -, /, or *: ");
    	operand = input.next();


    	//if user entered +
    	if(operand.matches("+")){
    		System.out.println("Numbers added = " + (num1+num2));
    	}
    	else if(operand.matches("-")){
    		System.out.println("Numbers subtracted = " + (num1-num2));
    	}
    	else if(operand.matches("/")){
    		System.out.println("Numbers divided = " + (num1/num2));
    	}
    	else{
    		System.out.println("Numbers multiplied = " + (num1*num2));
    	}

    }//end main method


}//end class