/**
 * @(#)namesGrades.java
 * Joey Tierney
 * Take in 5 names and grades. Print the name of the person with the highest and the lowest grade 
 * @version 1.00 2014/10/25
 */

import java.util.Scanner;
public class namesGrades {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	String name, lowname="", highname="";
    	int grade, i=1, lowest=100, highest=0;
    	
    	//loop to take in names
    	while(i<=5){
    		System.out.print("Enter name: ");
    		name = input.next();
    		System.out.print("Enter grade: ");
    		grade = input.nextInt();
    		
    		//check if grade is highest
    		if(grade>highest){
    			highest = grade;	//give highest the value of grade
    			highname = name;	//give highname the value of name
    		}//end if
    		//check if grade is lowest
    		if(grade<lowest){
    			lowest = grade;		//give lowest the value of grade
    			lowname = name;		//give lowname the value of name
    		}//end if
    		
    		//increment i
    		i++;
    	}//end while loop
    	
    	//print the results
    	System.out.println("\nName of the person with the highest grade is " + highname + " and their grade is " + highest);
    	System.out.println("Name of the person with the lowest grade is " + lowname + " and their grade is " + lowest);
    	
    	
    }//end main method
    
    
}//end class