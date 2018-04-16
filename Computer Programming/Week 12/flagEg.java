/**
 * @(#)flagEg.java
 * Use a flag to tell the user if someone failed an exam
 *
 * @author
 * @version 1.00 2015/1/9
 */


public class flagEg {

    public static void main(String args[]) {

    	boolean flag = false;
    	int grades[] = {56,65,34,54,90};

    	for(int i = 0; i<grades.length;i++){
    		if(grades[i] < 50){
    			flag = true;
    		}//end if
    	}//end for

    	if(flag == true){		//== because we are comparing values
    		System.out.println("At least one person failed");
    	}
    	else{
    		System.out.println("No one failed");
    	}

    }//end main method


}//end class