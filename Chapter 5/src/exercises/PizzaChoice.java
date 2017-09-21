package exercises;
import java.util.Scanner;
public class PizzaChoice {

	static Scanner input = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String choiceYes;
		String size = null;
		String choiceHotDog;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		
		System.out.println("Would you like a pizza?");
		choiceYes = input.nextLine();
		//Asks user if they want a pizza or not
		if("Yes".equalsIgnoreCase(choiceYes)||"Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
				System.out.print("Please choose a size: Small, Medium, or Large >> ");
				 size = input.nextLine();
				 if("Small".equalsIgnoreCase(size))
				 {
					displayPizzaSize(size);
					displayPizzaKind();
					displayPizzaToppings();
					System.out.println("You have ordered a SMALL pizza, your total cost will be $6.99. Thank you!");
					  
				 }
				 if("Medium".equalsIgnoreCase(size))
				 {
					 displayPizzaSize(size);
						displayPizzaKind();
						displayPizzaToppings();
					System.out.println("You have ordered a MEDIUM pizza, your total cost will be $9.99. Thank you!");

				 }
				 if("Large".equalsIgnoreCase(size))
				 {
					 displayPizzaSize(size);
						displayPizzaKind();
						displayPizzaToppings();
					System.out.println("You have ordered a LARGE pizza, your total cost will be $12.99. Thank you!");

				 }
		}
		else
		{
			System.out.println("Sorry, that is not a valid answer. Please try again.");
		}
		if("No".equalsIgnoreCase(choiceYes) || "N".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You do not want a pizza. Would you like a hot dog instead?");
			choiceHotDog = input.next();
			if("Yes".equalsIgnoreCase(choiceHotDog) || "Y".equalsIgnoreCase(choiceHotDog))
			{
				System.out.println("Okay, you have ordered a hot dog. The price is $2.50. Thank you!");
			}
			if("No".equalsIgnoreCase(choiceHotDog) || "N".equalsIgnoreCase(choiceHotDog))
			{
				System.out.println("We're sorry we couldn't help you find what you want, contact us at harambe.com!");
			}
		}
	}
	public static void displayPizzaSize(String size)
	{
		 System.out.println("You said " + size + " pizza size.");
	}
	public static void displayPizzaKind() 
	{
		 System.out.print("What kind of pizza do you want: pepperoni, sausage, or cheese? >> ");
		 String pizzaKind = input.nextLine();
		  if(("Pepperoni".equalsIgnoreCase(pizzaKind) || "Sausage".equalsIgnoreCase(pizzaKind)
				  || "Cheese".equalsIgnoreCase(pizzaKind)))
		  {
			  System.out.println("You said you want a " + pizzaKind + " type of pizza.");
		  }
		  else
		  {
			  System.out.println("Sorry, that is not a valid answer. Please try again.");
			  displayPizzaKind();
		  }
	}
	public static void displayPizzaToppings()
	{
		String toppingsChoice;
		System.out.println("Would you like extra toppings? >> ");
		toppingsChoice = input.nextLine();
		if("Yes".equalsIgnoreCase(toppingsChoice) || "Y".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("You said you want extra toppings.");
		}
		if("No".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("You said you do not want extra toppings.");
		}
		else
		{
			System.out.println("Sorry, that is not a valid answer. Please try again.");
			displayPizzaToppings();
		}
	}

}
