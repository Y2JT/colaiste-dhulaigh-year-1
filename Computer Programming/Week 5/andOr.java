/**
 * @(#)andOr.java
 *
 * Using and && and or ||
 * Roll 2 dice and see if you get a double 6 or a single 6
 * @version 1.00 2014/10/22
 */


public class andOr {

    public static void main(String args[]) {

    	int dice1, dice2;

    	//generate random numbers
    	dice1 = 1+(int)(Math.random()*6);
    	dice2 = 1+(int)(Math.random()*6);

    	System.out.println(dice1 + "\t\t" + dice2);

    	//check if a double 6 was rolled
    	if(dice1 == 6 && dice2 == 6){		//if dice1 is a 6 AND dice2 is a 6
    		System.out.println("Double 6");
    	}
    	else if(dice1 == 6 || dice2 == 6){	//if dice 1 is a 6 OR dice 2 is a 6
    		System.out.println("Single 6");
    	}
    	else{
    		System.out.println("No 6's rolled");
    	}


    }//end main method


}//end class