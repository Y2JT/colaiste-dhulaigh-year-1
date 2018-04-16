/**
 * @(#)agesQ1.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class agesQ1 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int i = 1, age, low = 100, high = 0, total = 0, average = 0;
    	
    	//while loop
    	while(i<=5){
    		System.out.print("Enter age " + i + ": ");
    		age = input.nextInt();
    		
    		total = total + age;
    		
    		if(age<low){
    			low = age;
    		}
    		if(age>high){
    			high = age;
    		}
    		i++;
    	}//end while
    	
    	i = 5;
    	
    	//calculate average
    	average = total/i;
    	
    	//print results
    	System.out.println("\nHighest age: " + high);
    	System.out.println("Lowest age: " + low);
    	System.out.println("Average age: " + average + "\n");
    	
    }//end main method
    
    
}//end class