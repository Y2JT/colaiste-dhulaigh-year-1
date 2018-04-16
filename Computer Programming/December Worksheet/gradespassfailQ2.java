/**
 * @(#)gradespassfailQ2.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class gradespassfailQ2 {

    public static void main (String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades, i, passes=0, fails=0;
    	
    	for(i=1; i<=10; i++){
    		System.out.print("Enter grade " + i + ": ");
    		grades = input.nextInt();
    		
    		if (grades>49){
    			passes ++;
    		}
    		else{
    			fails ++;
    		}
    	}//end for
    	
    	System.out.println("Number of passes: " + passes);
    	System.out.println("Number of fails: " + fails);
    	
    }//end main method
    
    
}//end class