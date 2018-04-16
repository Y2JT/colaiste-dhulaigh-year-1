/**
 * @(#)twonamesAges.java
 * Joey Tierney
 * Take in 2 names and ages, tell the user who the oldest is 
 * @version 1.00 2014/10/25
 */

import java.util.Scanner;
public class twonamesAges {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	String name, oldname="", youngname="";
    	int age, i=1, youngest=100, oldest=0;
    	
    	//loop to take in names
    	while(i<=2){
    		System.out.print("Enter name: ");
    		name = input.next();
    		System.out.print("Enter age: ");
    		age = input.nextInt();
    		
    		//check if age is highest
    		if(age>oldest){
    			oldest = age;	//give highest the value of age
    			oldname = name;	//give highname the value of name
    		}//end if
    		
    		if(age<youngest){
    			youngest = age;		//give lowest the value of age
    			youngname = name;	//give lowname the value of name
    		}//end if
    		
    		//increment i
    		i++;
    	}//end while loop
    	
    	//print the results
    	System.out.println("\nName of the oldest person is " + oldname + " and their age is " + oldest);
    	
    }//end main method
    
    
}//end class