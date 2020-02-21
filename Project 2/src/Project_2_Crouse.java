
import java.util.Scanner;

public class Project_2_Crouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//start scanner
		Scanner keyboard = new Scanner (System.in);
		
		//variables
		int number1;
		int number2;
		int number3;
		
		//user input
		System.out.println("Choose 3 numbers 1-100");
		number1 = keyboard.nextInt();
		number2 = keyboard.nextInt();
		number3 = keyboard.nextInt();
		
		
		//menu design/options
		System.out.println("Main Menu");
		System.out.println("\t1.) Add");
		System.out.println("\t2.) Subtract");
		System.out.println("\t3.) Multiply");
		System.out.println("\t4.) Divide");
		System.out.print("Please select a menu choice.");
		
		int menuChoice = keyboard.nextInt();
		
		switch (menuChoice) {
		
		
		//Using what we learned this week with the == sign I decided to 
		//add a third option in the off chance that the numbers were equal
		case 1:
			System.out.println(number1 + number2);
			if (number3 > (number1 + number2))
				System.out.println("Your third number is"
				+ " larger than the first two added together!");
			else
			{
				if (number1 < (number1 + number2))
					System.out.println("Your third number is smaller "
							+ "than the first two added together!");
				if (number1 == (number1+ number2))
					System.out.println("Your first two numbers added "
							+ "together are equal to your first two numbers added together!");
			}
			break;
		case 2:
			System.out.println(number1 - number2);
			if (number3 > (number1 - number2))
				System.out.println("Your third number is larger "
						+ "than the first two subtracted from each other!");
			else
			{
				if (number3 == (number1 - number2))
					System.out.println("Number 3 is equal to your first number subtracted from the second!");
				if (number3 < number1 - number2)	
					System.out.println("Your third number is smaller than the "
							+ "first two subtracted from eachother!");
			}
			break;
		case 3:
			System.out.println(number1 * number2);
			if (number3 > (number1 * number2))
				System.out.println("Your third number is larger than "
						+ "the first two multiplied together!");
			else
			{
				if (number3 < (number1 * number2))
					System.out.println("Your third number is smaller than the "
						+ "first two multiplied together!");
				if (number3 == (number1 * number2))
					System.out.println("Your first two numbers multiplied "
							+ "together are equal to the third number!");
			}
			break;
		case 4:
			System.out.println(number1 / number2);
			if (number3 > (number1 / number2))
				System.out.println("Your third number is larger than "
						+ "the first two divided by each other!");
			else
			{
				if (number3 < (number1 / number3))
					System.out.println("Your third number is smaller than "
						+ "the first two multiplied together!");
				if (number3 == (number1 / number2))
					System.out.println("Your third number is equal to the "
							+ "first two numbers divided by each other!");
			}
			break;
		}

	}

}
