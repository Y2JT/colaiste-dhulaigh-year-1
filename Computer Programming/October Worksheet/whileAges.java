/**
 * @(#)whileAges.java
 * Joey Tierney
 * Using a while loop, take in 5 ages, get the average, oldest and youngest age.
 * @version 1.00 2014/10/25
 */

import java.util.Scanner;
public class whileAges {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int i = 1, age;
    	int young = 100;
    	int old = 0;
    	int total = 0;
    	int average = 0;
    	
    	//while loop to take in ages
    	while(i<=5){
    		System.out.print("Enter age " + i + ": ");
    		age = input.nextInt();
    		
    		total = total + age;
    		
    		//check if age is youngest or oldest
    		if(age<young){
    			young = age;
    		}
    		if(age>old){
    			old = age;
    		}
    		//increment i
    		i++;
    	}//end while loop
    	
    	i = 5;
    	
    	//Calculate average
    	average = total/i;
    	
    	//Print results
    	System.out.println("\nOldest age is: " + old + " years old");
    	System.out.println("Youngest age is: " + young + " years old");
    	System.out.println("Average age is: " + average + " years old");
    	
    }//end main method
    
    
}//end class