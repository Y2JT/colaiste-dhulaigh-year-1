/**
 * @(#)assignmentOne.java
 * Joseph Tierney
 * Write a program for entering Leaving Cert grades for two students, calculate the points each achieved.
 * Use a while loop for one student and a for loop for the other.
 * Use the best six grades, remove the lowest achieved.
 * Print the total, highest, lowest and average each student got, as well as print who got the highest amount of points.
 * @version 1.00 2014/11/10
 */

import java.util.Scanner;
public class assignmentOne {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);		//needed to use Scanner

    	//declare variables
    	String student1="", student2="";
    	int i=1, grade1=0, grade2=0, points1=0, points2=0, highest1=0, highest2=0, lowest1=100, lowest2=100, average1=0, average2=0, total1=0, total2=0;

    	//prompt user to enter first students name
    	System.out.print("\nPlease enter first students name: ");
    	student1=input.nextLine();

    	//while loop to take in first set of grades
    	while(i<=7){
    		System.out.print("Enter grade " + i + ": ");
    		grade1 = input.nextInt();

    		//check if grade is the highest grade
    		if(points1>highest1){
    			highest1=points1;		//assign highest1 the points1 value
    		}//end if

			//if statement to determine the points achieved for each grade
    		if(grade1>90){
    			points1=100;
    			if(points1<lowest1){	//check if grade is the lowest grade
    			lowest1=points1;		//assign lowest1 the points1 value
    		}
    			System.out.println(" Grade is an A1: " + 100 + " points");
    		}//end if
    		else if(grade1>85){
    			points1=90;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is an A2: " + 90 + " points");
    		}
    		else if(grade1>80){
    			points1=85;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a B1: " + 85 + " points");
    		}
    		else if(grade1>75){
    			points1=80;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a B2: " + 80 + " points");
    		}
    		else if(grade1>70){
    			points1=75;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a B3: " + 75 + " points");
    		}
    		else if(grade1>65){
    			points1=70;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a C1: " + 70 + " points");
    		}
    		else if(grade1>60){
    			points1=65;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a C2: " + 65 + " points");
    		}
    		else if(grade1>55){
    			points1=60;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a C3: " + 60 + " points");
    		}
    		else if(grade1>50){
    			points1=55;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a D1: " + 55 + " points");
    		}
    		else if(grade1>45){
    			points1=50;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a D2: " + 50 + " points");
    		}
    		else if(grade1>=40){
    			points1=45;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a D3: " + 45 + " points");
    		}
    		else{
    			points1=0;
    			if(points1<lowest1){
    			lowest1=points1;
    		}
    			System.out.println(" Grade is a Fail: " + 0 + " points");
    		}
    		//calculate the total points for student1
    		total1 = total1 + points1;

    		//increment i
    		i++;

    	}//end while loop

    	//prompt user for second students name
    	System.out.print("\nPlease enter second students name: ");
    	if(i != 1){				//needed when using input.nextLine(); in a loop
    		input.nextLine();
    	}//end if(i != 1)
    	student2=input.nextLine();

    	//for loop to take in second set of grades
    	for(i=1;i<=7;i++){
    		System.out.print("Enter grade " + i + ": ");
    		grade2 = input.nextInt();

    		//check if grade is the highest grade
    		if(points2>highest2){
    			highest2=points2;	//assign highest2 the points2 value
    		}

    		//if statement to determine the points achieved for each grade
    		if(grade2>90){
    			points2=100;
    			if(points2<lowest2){	//check if grade is the lowest grade
    			lowest2=points2;		//assign lowest2 the points2 value
    		}
    			System.out.println(" Grade is an A1: " + 100 + " points");
    		}
    		else if(grade2>85){
    			points2=90;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is an A2: " + 90 + " points");
    		}
    		else if(grade2>80){
    			points2=85;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a B1: " + 85 + " points");
    		}
    		else if(grade2>75){
    			points2=80;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a B2: " + 80 + " points");
    		}
    		else if(grade2>70){
    			points2=75;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a B3: " + 75 + " points");
    		}
    		else if(grade2>65){
    			points2=70;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a C1: " + 70 + " points");
    		}
    		else if(grade2>60){
    			points2=65;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a C2: " + 65 + " points");
    		}
    		else if(grade2>55){
    			points2=60;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a C3: " + 60 + " points");
    		}
    		else if(grade2>50){
    			points2=55;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a D1: " + 55 + " points");
    		}
    		else if(grade2>45){
    			points2=50;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a D2: " + 50 + " points");
    		}
    		else if(grade2>=40){
    			points2=45;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a D3: " + 45 + " points");
    		}
    		else{
    			points2=0;
    			if(points2<lowest2){
    			lowest2=points2;
    		}
    			System.out.println(" Grade is a Fail: " + 0 + " points");
    		}

    		//calculate the total points for student2
    		total2 = total2 + points2;

    	}//end for loop

    	//remove lowest score from each total
    	total1 = total1 - lowest1;
    	total2 = total2 - lowest2;

    	//calculate the average for each student
    	average1 = total1/6;		//divide by 6 (as using the best 6 grades for total)
    	average2 = total2/6;		//divide by 6 (as using the best 6 grades for total)

    	//print results for the first student
    	System.out.println("\n\n**********   " + student1 + " Score Board    **********");

    	System.out.println("\n" + student1 + "'s Total Points scored: " + total1);
    	System.out.println(student1 + "'s Highest Points achieved: " + highest1);
    	System.out.println(student1 + "'s Lowest Points achieved: " + lowest1);
    	System.out.println(student1 + "'s Average Points achieved: " + average1);
    	System.out.println();		//print a blank line

    	//print results for the second student
    	System.out.println("\n\n**********   " + student2 + " Score Board    **********");

    	System.out.println("\n" + student2 + "'s Total Points scored: " + total2);
    	System.out.println(student2 + "'s Highest Points achieved: " + highest2);
    	System.out.println(student2 + "'s Lowest Points achieved: " + lowest2);
    	System.out.println(student2 + "'s Average Points achieved: " + average2);
    	System.out.println();		//print a blank line

    	//print which student has the highest amount of points
    	System.out.println("\n\n**********   The Highest Amount of Points Score Board    **********");

    	//if statement to determine which student got the highest points
    	if(total1>total2){
    		System.out.println("\nStudent with the highest amount of points is " + student1);
    	}
    	else if(total2>total1){
    		System.out.println("\nStudent with the highest amount of points is " + student2);
    	}
    	else{
    		System.out.println("\nThe two students got the same amount of points");
    	}

    	System.out.println();		//print a blank line

    }//end main method

}//end class