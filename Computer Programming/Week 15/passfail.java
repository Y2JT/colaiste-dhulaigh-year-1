/**
 * @(#)passfail.java
 *
 *
 * @author
 * @version 1.00 2015/1/30
 */

import java.util.io;
public class passfail {

    public static void main(String args[]) {

    	int grades[] = {30, 55, 90, 37, 62};
    	String names[] = {"Bill", "Ben", "Ted", "Fred", "John"};
    	String pass = "\nPeople who passed are: \nName\t\tGrade\n\n";
    	String fails = "\nPeople who failed are: \nName\t\tGrade\n\n";

		//loop to take in grades
    	for(int i = 0; i<names.length; i++){
    		if(grades[i]>49){
    			if(names[i].length()<8){
    				pass +=  names[i] + "\t\t" + grades[i] + "\n";
    			}
    			else{
    				pass +=  names[i] + "\t" + grades[i] + "\n";
    			}
    		}
    		else{
    			if(names[i].length()<8){
    				fails += names[i] + "\t\t" + grades[i] + "\n";
    			}
    			else{
    				fails += names[i] + "\t" + grades[i] + "\n";
    			}
    		}//end if
    	}//end for

    	//print results
    	System.out.println(pass + "\n" + fails);
    	System.out.println(names[0].length());

    	try{
    		BufferedWriter Information = new BufferedWrtier(new FileWriter("passfail.doc", true));)
    			Information.newLine();
    			Information.write(pass);
    			Information.write(fails);
    			Information.close();
    			System.out.println("File Saved");
    	}
    	catch(Exception ex){
    		System.out.println("Could not write to file");
    	}

    }//end main method


}//end class