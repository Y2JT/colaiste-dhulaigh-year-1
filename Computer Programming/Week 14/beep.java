/**
 * @(#)beep.java
 *
 *
 * @author
 * @version 1.00 2015/1/23
 */


public class beep {

    public static void main(String args[]) {

    	//creates a beep
    	System.out.print("\007");

    	System.out.println("Next beep");

    	//creates beep
    	java.awt.Toolkit.getDefaultToolkit().beep();
    }//end main method


}//end class