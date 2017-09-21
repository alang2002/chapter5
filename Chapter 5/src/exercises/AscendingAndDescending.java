package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		System.out.println("Please enter an integer >> ");
		firstNumber = input.nextInt();
		System.out.println("Please enter an integer >> ");
		secondNumber = input.nextInt();
		System.out.println("Please enter an integer >> ");
		thirdNumber = input.nextInt();
		
		System.out.println(firstNumber + "     " + thirdNumber);
		System.out.println(secondNumber + "     " + secondNumber);
		System.out.println(thirdNumber + "     " + firstNumber);
		
	}

}
