/**
 * @(#)underAge.java
 * Joey Tierney
 * Take in 5 ages, tell the user if anyone is under 18
 * @version 1.00 2014/10/25
 */

import java.util.Scanner;
public class underAge {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	int age, under = 0, i=1;	//under is the counter for anyone under 18
    	
    	//loop to take in ages
    	while(i<6){
    		System.out.print("Enter age " + i + ": ");
    		age = input.nextInt();
    		
    		//check if anyone is under 18
    		if(age<18){
    			under++;
    		}//end if
    		
    		//increment i
    		i++;
    			
    	}//end while
    	
    	//check the value of under
    	if(under>0){
    		System.out.println("\nSomeone is under the age of 18");
    	}
    	else{
    		System.out.println("\nNobody is under age");
    	}
    	
    	System.out.println();	//print blank line
    	
    }//end main method
    
    
}//end class