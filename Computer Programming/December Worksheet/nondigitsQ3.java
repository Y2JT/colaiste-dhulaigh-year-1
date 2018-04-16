/**
 * @(#)nondigitsQ3.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class nondigitsQ3 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	int grade[] = new int[1];
    	String strgrade;
  		
  		//loop to take in grade
  		for(int i = 0;i<grade.length;i++){
  			System.out.print("Enter grade " + (i+1) + ": ");
  			//take in grade as a string
  			strgrade = input.next();
  			
  			//check strgrade contains only digits
  			while(!strgrade.matches("\\d+")){
  				System.out.println("Error, numbers only");
  				System.out.print("Enter grade " + (i+1) + ": ");
  				strgrade = input.next();
  			}//end while
  			
  			//change grade to an int
  			grade[i] = Integer.parseInt(strgrade);
  			
  			//check if grade is Distinction, Merit, Pass or Fail
  			if(grade[i] > 79){
  				System.out.print("You got a Distinction\n\n");
  			}
  			else if(grade[i] > 59){
  				System.out.print("You got a Merit\n\n");
  			}
  			else if(grade[i] > 49){
  				System.out.print("You got a Pass\n\n");
  			}
  			else{
  				System.out.print("Unsuccessful\n\n");
  			}
  			
  		}//end for
    	
    	
    	
    }
    
    
}