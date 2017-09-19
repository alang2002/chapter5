package conditionalLogic;

import java.util.Scanner;
public class IFStatements {

	public static void main(String[] args) {
		int age;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age >> ");
		age = input.nextInt();
		if(age <= 18)
		{
			System.out.println("User is less than 18.");
		}
		if (age >= 23 & age <= 30)
		{
			System.out.println("User is reaching their prime 20's.");
		}
		if (age >= 31 & age <= 50)
		{
			System.out.println("User is middle aged.");
		}
		if (age >= 50 & age <= 65)
		{
			System.out.println("User is reaching old age.");
		}
		if (age >= 66 & age <= 100)
		{
			System.out.println("User is a very elderly person.");
		}

	}

}
