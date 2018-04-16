/**
 * @(#)compareNumbers.java
 * Joey Tierney
 *
 * Compare two numbers and see if they are the same or which is bigger
 *
 * @author
 * @version 1.00 2014/9/26
 */


public class compareNumbers {

    public static void main(String args[]) {

    	int num1 = 6;
    	int num2 = 7;

    	//check which number is the biggest
    	if(num1 > num2){    //if num1 is greater than num2
    		System.out.println("Number 1 is bigger ");
    	}
    	else if(num2 > num1){   //otherwise if num2 is greater than num1
    		System.out.println("Number 2 is bigger ");
    	}
    	else{
    		System.out.println("Number 1 and Number 2 are equal ");
    	}


    }//end main method


}//end class