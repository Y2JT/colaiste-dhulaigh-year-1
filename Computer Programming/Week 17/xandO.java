/**
 * @(#)xando.java
 *
 *
 * @author
 * @version 1.00 2012/1/16
 */

import java.util.Scanner;
public class xandO {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare 2D array for the grid
    	String grid [][] = new String [3][3];
    	String play= "y";

    	while (play.matches("y")){

	    	int counter=0;
	    	int winflag =0;
	    	int num2, num1;


	    	//put spaces in the array
	    	for (int i = 0; i <3; i++){
	    		for(int x = 0; x<3; x++){
	    			grid[i][x] = " ";
	    		}//end inner for
	    	}//end outer for

	    	///HERE ____________
	    	while(counter <10){
		    	System.out.println("\ta   b   c");
		    	//print the grid rows
		    	for(int i = 0; i<3;i++){
		    		//print grid colums
		    		System.out.println("");

		    		//print the grid number
		    		System.out.print(i+1 + "\t");
		    		for(int x =0; x <3; x++){
		    			//print a space in the grid
		    			System.out.print( grid[i][x]   );
		    			if(x<2){
		    				System.out.print(" | ");
		    			}

		    		}//end inner for
		    		//print a line under
		    		if (i<2){
		    			System.out.println("\n\t----------");
		    		}//end if

		    	}//end outer for

		    	//prompt x or O to go
		    	//if we divide the counter by 2 and get a remainder of 0
		    	if((counter %2 )==0){
		    		System.out.print("\n\nX Go\n");
		    	}
		    	else{
		    		System.out.print("\n\nO Go\n");
		    	}

		    	do{

		    	//prompt the user for a choice
		    	System.out.print("Enter a, b or c: ");
		    	String choice = input.next();
		    	System.out.print("Enter 1,2 or 3: ");
		    	num1 = input.nextInt();


		    	//make sure choice is lower case
		    	choice = choice.toLowerCase();

		    	if (choice.matches("a")){
		    		num2 = 0;
		    	}
		    	else if (choice.matches("b")){
		    		num2= 1;
		    	}
		    	else{
		    		num2=2;
		    	}
		    		if(!grid[num1-1][num2].matches(" ")){
		    			System.out.println("Error, already taken");
		    		}
		    	}//end do
		    	while(!grid[num1-1][num2].matches(" "));


		    	if ((counter%2 )==0){
		    		grid[num1-1][num2]="X";
		    	}
		    	else{
		    		grid[num1-1][num2] = "O";
		    	}

		    	//blank lines
		    	System.out.println("\n\n");

		    	//check for a win
		    	if (counter >3){	//only check on go 5,  0,1,2,3
		    		//check for x win
		    		//Horizontal
		    		if (grid[0][0].matches("O")&& grid[0][1].matches("O") && grid[0][2].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[1][0].matches("O")&& grid[1][1].matches("O") && grid[1][2].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[2][0].matches("O")&& grid[2][1].matches("O") && grid[2][2].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if

		    		//vertical
		    		else if (grid[0][0].matches("O")&& grid[1][0].matches("O") && grid[2][0].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[0][1].matches("O")&& grid[1][1].matches("O") && grid[2][1].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[0][2].matches("O")&& grid[1][2].matches("O") && grid[2][2].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if

		    		//diagonal
		    		else if (grid[0][0].matches("O")&& grid[1][1].matches("O") && grid[2][2].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[2][0].matches("O")&& grid[1][1].matches("O") && grid[0][2].matches("O")){
		    			System.out.println("-------------O WINS -----------");
		    			winflag =1;
		    		}//end if

		    		///check for O win
		    			//check for a win

		    		//check for x win
		    		//Horizontal
		    		else if (grid[0][0].matches("X")&& grid[0][1].matches("X") && grid[0][2].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[1][0].matches("X")&& grid[1][1].matches("X") && grid[1][2].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[2][0].matches("X")&& grid[2][1].matches("X") && grid[2][2].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if

		    		//vertical
		    		else if (grid[0][0].matches("X")&& grid[1][0].matches("X") && grid[2][0].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[0][1].matches("X")&& grid[1][1].matches("X") && grid[2][1].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[0][2].matches("X")&& grid[1][2].matches("X") && grid[2][2].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if

		    		//diagonal
		    		else if (grid[0][0].matches("X")&& grid[1][1].matches("X") && grid[2][2].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if
		    		else if (grid[2][0].matches("X")&& grid[1][1].matches("X") && grid[0][2].matches("X")){
		    			System.out.println("-------------X WINS -----------");
		    			winflag =1;
		    		}//end if

		    		//check for draw
		    		if(counter == 8 &&  winflag==0){
		    			System.out.println("------- Draw --------");
		    			System.out.println("\ta   b   c");
				    	//print the grid rows
				    	for(int i = 0; i<3;i++){
				    		//print grid colums
				    		System.out.println("");

				    		//print the grid number
				    		System.out.print(i+1 + "\t");
				    		for(int x =0; x <3; x++){
				    			//print a space in the grid
				    			System.out.print( grid[i][x]   );
				    			if(x<2){
				    				System.out.print(" | ");
				    			}

				    		}//end inner for
				    		//print a line under
				    		if (i<2){
				    			System.out.println("\n\t----------");
				    		}//end if

				    	}//end outer for


		    			System.out.print("Play again? (y/n)");
		    			play = input.next();
		    			play = play.toLowerCase();
		    			counter =11; //here______________

		    			//counter = 11;
		    		}//end if draw

		    	}//end if counter >3



		    	if (winflag ==1){
		    		System.out.println("\ta   b   c");
				    //print the grid rows
				    for(int i = 0; i<3;i++){
				    	//print grid colums
				    	System.out.println("");

				    	//print the grid number
				    	System.out.print(i+1 + "\t");
				    	for(int x =0; x <3; x++){
				    		//print a space in the grid
				    		System.out.print( grid[i][x]   );
				    		if(x<2){
				    			System.out.print(" | ");
				    		}

				    	}//end inner for
				    	//print a line under
				    	if (i<2){
				    		System.out.println("\n\t----------");
				    	}//end if

				   	}//end outer for

	    			System.out.print("\n\nPlay again? (y/n)");
		    		//counter = 11;
		    		play = input.next();
		    		play = play.toLowerCase();
		    		counter =11; //here______________
		    	}//end if winflag

		    	//increment counter
		    	counter++;
	    	}//end while
    	}//end while play


    }//end main

}//end class