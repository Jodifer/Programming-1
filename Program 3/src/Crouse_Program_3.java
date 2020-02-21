//Program 3
//Author: Jody Crouse
//Date last modified: 02/21/20

import java.util.Scanner;

public class Crouse_Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner Start
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		String name;
		int number1;
		
		//Asking for variables
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("Choose a number between 1-100.");
		number1 = keyboard.nextInt();
		
		//Do while loop to repeat process till user picks a number between 1-100
		do
		{
			if (number1 < 101)
				System.out.println("Thank you for your input " + name + ".");	
			else
			{
				if (number1 > 100)
					System.out.println("Please choose a number between 1-100.");
				number1 = keyboard.nextInt();
				if (number1 <101)
					System.out.println("Thank you for your input " + name + ".");
			}
		}while (number1 > 100);

		//Simple for loop
		for(number1--; number1 >= 0; number1--)
		{
			if (number1 > 5)
			{
				System.out.println(number1);
				System.out.println("Expect a surprise at 0!");
			}
			else
			{
				if(number1 == 5)
				{
					System.out.println(number1);
					System.out.println("Down to the last 5!");
				}
				if(number1 == 4)
				{
					System.out.println(number1);
					System.out.println("This is instantaneous but seems like forever to me.");
				}
				if(number1 == 3)
				{
					System.out.println(number1);
					System.out.println("Oh boy we are getting close.");
				}
				if(number1 == 2)
				{
					System.out.println(number1);
					System.out.println("SO CLOSE!!!!");
				}
				if(number1 == 1)
				{
					System.out.println(number1);
					System.out.println("SUPER CLOSE!!!!!!");
				}
				if(number1 == 0)
				{
					System.out.println(number1);
					System.out.println("SURPRISE here is hopefully your biggest "
						+ "letdown of the day!\nHave a wonderful day");
				}
			}
		}
		
		//Closing Keyboard
		keyboard.close();
	}

}
