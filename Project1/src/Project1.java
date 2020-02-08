// Program #1
// Author: Jody Crouse
// Due Date: 02/06/20

import java.util.Scanner;

public class Project1 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//Scanner Start
			Scanner keyboard = new Scanner (System.in);
			
			//Variables
			String month;
			int day;
			short year;
			String yes;
			int age;
			
			//User input
			System.out.print("What month is it?\n");
			month = keyboard.next();
			System.out.println("What is the numerical date?");
			day = keyboard.nextInt();
			System.out.print("What year is it?\n");
			year = keyboard.nextShort();
			
			//Result - also in terms of the answer to the statement on line
			//I opted to use a vague response as i could not figure out how
			//to create a response to both the yes and the no.
			System.out.print("The current date is " + month + " " + day 
					+ ", " + year + ".\n");
			System.out.print("Have you stayed true to your new years "
					+ "resolution?\n");
			System.out.print("Yes/No\n");
			yes = keyboard.next();
			System.out.print("Well that is quite apparent!\n");
			//Funny cause the way one can react to this statement above 
			//solely depends on their answer.
			System.out.print("What is your age?\n");
			age = keyboard.nextInt();
			System.out.print("Now that makes a lot of sense.\nHowever I "
					+ "must get back to my work.\nHave a good day!");
			
			keyboard.close();
			
			

	}

}
