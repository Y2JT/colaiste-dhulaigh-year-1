/**
 * @(#)passfailQ8.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class passfailQ8 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[10], i;
    	String pass = "\n\nPass Grades:\n\n";
    	String fails = "\n\nFail Grades:\n\n";
    	
    	//loop to take in grades
    	for(i = 0; i < grades.length; i++){
    		System.out.print("Enter grade " + (i+1) + ": ");
    		grades[i] = input.nextInt();
    		
    		//check grade
    		if(grades[i] >= 49){
    			pass += "\t" + grades[i];
    		}
    		else{
    			fails += "\t" + grades[i];
    		}
    	}//end for
    	
    	System.out.println(pass);
    	System.out.println(fails);
    	
    }//end main method
    
    
}//end class