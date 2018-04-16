/**
 * @(#)oldestYoungest.java
 * Joey Tierney
 * Take in 5 names and 5 ages. Print the name of the person with the youngest and oldest age and their age
 * @version 1.00 2014/10/22
 */

import java.util.Scanner;
public class oldestYoungest {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	String name, youngname="", oldname="";
    	int age, i=1, youngest = 100, oldest = 0;

    	//while loop
    	while(i<=5){
    		System.out.print("Enter your name: ");

    		//needed when using input.nextLine(); in a loop
    		if(i != 1){
    			input.nextLine();
    		}//end if i ! = 1
    		name = input.nextLine();

    		System.out.print("Enter your age: ");
    		age = input.nextInt();
    		//if statement
    		if (age > oldest){
    			oldest = age;
    			oldname = name;
    		}//end if

    		if (age < youngest){
    			youngest = age;
    			youngname = name;
    		}//end if
    		i++;
    	}//end while

    	System.out.println("\nThe oldest person is " + oldname + " and their age is " + oldest + " years old");
    	System.out.println("The youngest person is " + youngname + " and their age is " + youngest + " years old\n");

    }//end main method

}//end class