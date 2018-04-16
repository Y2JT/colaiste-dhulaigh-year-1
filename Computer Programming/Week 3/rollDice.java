/**
 * @(#)rollDice.java
 * Joey Tierney
 *
 * Simulate rolling a dice by generating a random number from 1 to 6
 *
 * @author
 * @version 1.00 2014/10/3
 */


public class rollDice {

    public static void main(String args[]) {

    	int num;	//variable to hold a random number

    	//loop to generate 10 numbers
    	for(int i =1; i<=1000; i++){
    		//generate the random number
	    	num = 1 + (int) (Math.random()*6);

			//print the random number
			//System.out.println(num);

			if(num == 1){
				System.out.print("%");
			}
			else if(num == 2){
				System.out.print("h");
			}
			else if(num == 3){
				System.out.print("*");
			}
			else if(num == 4){
				System.out.print("$");
			}
			else if(num == 5){
				System.out.print("X");
			}
			else{
				System.out.print("!");
			}
    	}//end for



    }//end main method


}//end class