package exercises;
import java.util.Scanner;
public class PizzaHut {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String choiceYes;
		String size = null;
		String choiceHotDog;
		double mediumCost = 9.99;
		double largeCost = 12.99;
		double smallCost = 6.99;
		
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
					  {
						 
					  }
				 }
				 if("Medium".equalsIgnoreCase(size))
				 {
					 
				 }
				 if("Large".equalsIgnoreCase(size))
				 {
					 
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
			  System.out.println("You said a " + pizzaKind + " type of pizza.");
		  }
	}
	public static void displayPizzaToppings()
	{
		String toppingsChoice;
		System.out.println("Would you like extra toppings? >> ");
		toppingsChoice = input.nextLine();
		if("Yes".equalsIgnoreCase(toppingsChoice))
		{
			System.out.println("You said you want ");
		}
	}

}
