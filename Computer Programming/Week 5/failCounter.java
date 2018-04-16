/**
 * @(#)failCounter.java
 *
 * Take in 5 grades and tell the user if anyone has failed. Use a counter to see if anyone fails
 * @version 1.00 2014/10/24
 */
import java.util.Date;				//needed to use date
import java.util.Scanner;
public class failCounter {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int grade, fail = 0, i=1;	//fails is the counter for how many people failed

    	Date d = new Date();		//declares the date

    	System.out.println(d);		//prints the date
    	System.out.println();

		//loop to take in grades
    	while(i<6){
    		//prompt the user
    		System.out.print("Enter grade " + i + ": ");
    		//take in the grade
    		grade = input.nextInt();

			//check if anyone failed
    		if(grade < 50){
    			fail++;
    		}//end if

    		//increment i
    		i++;

    	}//end while

    	//check the value of fails
		if (fail>0){
			System.out.println("\nSomeone failed");
		}
		else{
			System.out.println("\nNobody failed");
		}

		System.out.println();

    }//end main method

}//end class