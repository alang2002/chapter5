package gameZone;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int random = rand.nextInt(10) + 1;
		int guess;
		
		System.out.println("Guess a number between 1 and 10.");
		guess = input.nextInt();
		
		if(guess > random)
		{
			System.out.println("Too high!");
		}
		if(guess < random)
		{
			System.out.println("Too low!");
		}
		if(guess == random)
		{
			System.out.println("You got it!");
		}

	}

}
