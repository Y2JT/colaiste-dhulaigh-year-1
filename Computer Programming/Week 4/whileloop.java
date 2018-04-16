/**
 * @(#)whileloop.java
 * Joey Tierney
 * Print the values from 1 to 10 using a while loop
 * @version 1.00 2014/10/15
 */


public class whileloop {

    public static void main(String args[]) {

    	//counter for the while loop
    	int i = 1;

    	//start while loop
    	while(i<=10){
    		System.out.println(i);
    		//print a beep
    		System.out.print("\007");
    		//increment i
    		i++;
    	}//end while

    	//use a for loop to print the numbers from 1 to 10
    	for(i=1;i<=10;i++){
    		System.out.println(i);
    	}//end for

    	System.out.println("\n\nUse a while loop to count backwards");
    	//reset i
    	i = 10;
		while(i>=1){
			System.out.println(i);
			i--;
		}//end while


    }//end main method


}//end class