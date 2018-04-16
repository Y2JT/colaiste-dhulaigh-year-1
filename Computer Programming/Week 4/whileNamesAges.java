/**
 * @(#)whileNamesAges.java
 *
 * Take in 5 names and 5 ages. Print the name of the person with the highest age and their age.
 * Print the name of the person with the lowest age and their age.
 *
 * @author
 * @version 1.00 2014/10/17
 */

import java.util.Scanner;
public class whileNamesAges {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	String name, youngname = "", oldname = "";
    	int age, i = 1, youngest = 100, oldest = 0;

    	//loop to take in the names
    	while(i<=5){
    		System.out.print("Enter name: ");
    		name = input.next();
    		System.out.print("Enter age: ");
    		age = input.nextInt();

    		//check if age is the oldest
    		if (age > oldest){
    			oldest = age;	//give oldest value of age
    			oldname = name;	//give oldname the value of name
    		}//end if

    		if (age < youngest){
    			youngest = age;	//give youngest the value of age
    			youngname = name;	//give youngname the value of name
    		}//end if

    		//increment i
    		i++;
    	}//end while loop

    	//print the result
    	System.out.println("\nYoungest person is " + youngname + " and is " + youngest + " years old");
    	System.out.println("Oldest person is " + oldname + " and is " + oldest + " years old");

    }//end main method

}//end class