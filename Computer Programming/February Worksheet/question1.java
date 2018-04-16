/**
 * @(#)question1.java
 * Write a program that will take in 5 ages and 5 grades
 * Validate the grades
 * Show the user the people who are above 18 and below 18
 *
 * @author 
 * @version 1.00 2015/2/24
 */

import java.util.Scanner;
public class question1 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[5];
    	int ages[] = new int [5];
    	String names[] = new String[5];
    	String strgrades;
    	int usergrades;
    	
    	//loop to take in names, ages, and grades
    	for(int i =0; i<names.length; i++){
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.next();
    		//loop for ages
    		System.out.print("Enter age for " + names[i] + ": ");
    		ages[i] = input.nextInt();
    		//loop for grades
    		System.out.print("Enter grade for " + names[i] + ": ");
    		strgrades=input.next();
    		//validate grades
    		while(!strgrades.matches("\\d+")){
    			System.out.println("ERROR, NUMBERS ONLY");
    			System.out.print("Enter grade for " + names[i] + ": ");
    			strgrades=input.next();
    		}//end while
    		//parse the grade
    		usergrades = Integer.parseInt(strgrades);
    	}//end for
    	
    	//people who are above 18
    	System.out.println("\nPeople who are above 18");
    	System.out.println("\n\nName\t\tAge");
    	//loop to check who is above 18
    	for(int i = 0; i<ages.length;i++){
    		if(ages[i]>=18){
    			System.out.println(names[i] + "\t\t" + ages[i]);
    		}//end if
    	}//end for
    	
    	//people who are below 18
    	System.out.println("\nPeople who are below 18");
    	System.out.println("\n\nName\t\tAge");
    	//loop to check who is below 18
    	for(int i = 0; i<ages.length;i++){
    		if(ages[i]<18){
    			System.out.println(names[i] + "\t\t" + ages[i]);
    		}//end if
    	}//end for
    	
    }//end main method
    
    
}//end class