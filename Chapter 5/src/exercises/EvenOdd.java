package exercises;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer >> ");
		number = input.nextInt();
		
		int isEven = number % 2;
		
		if(isEven == 0)
		{
			System.out.println("Your number is even");
		}
		else
		{
			System.out.println("Your number is odd");
		}

	}

}
