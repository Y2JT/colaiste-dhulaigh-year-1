/**
 * @(#)switchcase.java
 * Roll a dice and tell the use if they rolled 1,2,3 or something else
 *
 * @author
 * @version 1.00 2015/1/28
 */


public class switchcase {

    public static void main(String args[]) {

    	//declare variables
    	int num;

    	num = 1 +(int)(Math.random()*6);

    	switch(num){
    		case 1:
    			System.out.println("You rolled 1");
    			break;
    		case 2:
    			System.out.println("You rolled 2");
    			break;
    		case 3:
    			System.out.println("You rolled 3");
    			break;
    		default:
    			System.out.println("You rolled 4, 5, or 6");
    	}//end switch

    }//end main method


}//end class