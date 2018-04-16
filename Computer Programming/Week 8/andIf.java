/**
 * @(#)andIf.java
 *
 * Roll two dice and see if a single 6 or a double 6 was rolled
 *
 * @author
 * @version 1.00 2014/12/3
 */

public class andIf {

    public static void main(String args[]) {

    	int dice1, dice2;

    	//roll the dice once
    	System.out.println("After first roll\n");
    	dice1 = 1+(int)(Math.random()*6);
    	dice2 = 1+(int)(Math.random()*6);

    	//check if a double 6 was rolled
    	if(dice1 == 6 && dice2 == 6){	//if dice1 is 6 AND dice 2 is 6
    		System.out.println("Double 6\n");
    	}
    	else if(dice1 == 6 || dice2 == 6){	//if dice1 is 6 OR dice2 is 6
    		System.out.println("Single 6\n");
    	}
    	else{
    		System.out.println("No 6 was rolled\n");	//if no 6 is rolled
    	}

    	//reset dice
    	dice1 = 0;
    	dice2 = 0;
    	int counter = 0;	//count the number of rolls

    	//roll the dice until at least one 6 is rolled
    	System.out.println("\nRolling until at least one 6 rolled...");
    	//while loop to keep looping until at least one 6 rolled
    	while(dice1 != 6 && dice2 != 6){
    		//roll the dice and increment counter
    		dice1 = 1+(int)(Math.random()*6);
    		dice2 = 1+(int)(Math.random()*6);
    		counter++;

    		//check if double 6 was rolled
    		if(dice1 == 6 && dice2 == 6){
    			System.out.println("\nDouble 6 was rolled after " + counter + " goes");
    		}
    		else if(dice1 == 6 || dice2 == 6){
    			System.out.println("\nSingle 6 was rolled after " + counter + " goes");
    			break;
    		}

    	}//end while

    }//end main method

}//end class