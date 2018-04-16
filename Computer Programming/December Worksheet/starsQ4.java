/**
 * @(#)starsQ4.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class starsQ4 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	int age[] = new int[1];
    	int i;
    	String strage;
    	
    	//loop to take in age
    	for(i = 0;i<age.length;i++){
    		System.out.print("Enter age: ");
    		//take age as string
    		strage = input.next();
    		
    		//check strage contains only digits
    		while(!strage.matches("\\d+")){
  				System.out.println("Error, numbers only");
  				System.out.print("Enter age: ");
  				strage = input.next();
  			}//end while
  			
  			//change age to an int
  			age[i] = Integer.parseInt(strage);

    	//start while loop for stars
    	while(i<=age[i]){
    		System.out.println("*");
    		i++;
    	}//end while
    	
    	}//end for
    
    }//end main method
    
    
}//end class