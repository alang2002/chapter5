package exercises;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DelgadosChoice {

	static Scanner input = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("$0.00");
	
	public static void main(String[] args) {
		System.out.println("Welcome to Delgados Tacos!");
		System.out.println("Look at our menu: ");
		order();
	}
	
	public static void order() 
	{
		double tacoPrice = 1.99;
		double enchilada = 2.75;
		double water = .99;
		double churros = .99;
		double mexicanCandy = 1.25;
		double pop = 1.35;
		double nachos = 1.99;
		double burrito = 1.99;
		double extraToppings = .99;
		double chimichanga = 2.25;
		double totalPrice;
		double tacoPriceTotal;
		double enchiladaPriceTotal;
		double waterPriceTotal;
		double churrosPriceTotal;
		double mexicanCandyPriceTotal;
		double popPriceTotal;
		double nachosPriceTotal;
		double burritoPriceTotal;
		double extraToppingsPriceTotal;
		double chimichangaPriceTotal;
		int amountTacosOrdered = 0;
		int amountEnchiladasOrdered = 0;
		int amountWatersOrdered = 0;
		int amountChurrosOrdered = 0;
		int amountMexicanCandyOrdered = 0;
		int amountPopsOrdered = 0;
		int amountNachosOrdered = 0;
		int amountBurritosOrdered = 0;
		int amountExtraToppingsOrdered = 0;
		int amountChimichangasOrdered = 0;
		int choice;
		String order;
		
		System.out.println("Tacos $1.99 (1)             Enchiladas $2.75 (2) \nWater $.99 (3)              Churros $.99 (4) \nMex. Candy $1.25 (5)     "
				+ "   Pop $1.35 (6) \nNachos $1.99 (7)            Burritos $1.99 (8)"
				+ " \nExtra Toppings $.99 (9)     Chimichangas $2.25 (10)");
		
		System.out.println("Choose a number to order that item.");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("How many tacos would you like? >> ");
			amountTacosOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 2)
		{
			System.out.println("How many enchiladas would you like? >> ");
			amountEnchiladasOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 3)
		{
			System.out.println("How many waters would you like? >> ");
			amountWatersOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 4)
		{
			System.out.println("How many churros would you like? >> ");
			amountChurrosOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 5)
		{
			System.out.println("How many mexican candies would you like? >> ");
			amountMexicanCandyOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 6)
		{
			System.out.println("How many pops would you like? >> ");
			amountPopsOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 7)
		{
			System.out.println("How many nachos would you like? >> ");
			amountNachosOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 8)
		{
			System.out.println("How many burritos would you like? >> ");
			amountBurritosOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 9)
		{
			System.out.println("How many extra toppings would you like? >> ");
			amountExtraToppingsOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		if(choice == 10)
		{
			System.out.println("How many chimichangas would you like? >> ");
			amountChimichangasOrdered = input.nextInt();
			System.out.println("Would you like to order something else?");
			order = input.next();
			if("Yes".equalsIgnoreCase(order))
			{
				order();
			}
		}
		
		tacoPriceTotal = amountTacosOrdered * tacoPrice;
		enchiladaPriceTotal = amountEnchiladasOrdered * enchilada;
		waterPriceTotal = amountWatersOrdered * water;
		churrosPriceTotal = amountChurrosOrdered * churros;
		mexicanCandyPriceTotal = amountMexicanCandyOrdered * mexicanCandy;
		popPriceTotal = amountPopsOrdered * pop;
		nachosPriceTotal = amountNachosOrdered * nachos;
		burritoPriceTotal = amountBurritosOrdered * burrito;
		extraToppingsPriceTotal = amountExtraToppingsOrdered * extraToppings;
		chimichangaPriceTotal = amountChimichangasOrdered * chimichanga;
		
		totalPrice = tacoPriceTotal + enchiladaPriceTotal + waterPriceTotal + churrosPriceTotal 
				+ mexicanCandyPriceTotal + popPriceTotal + nachosPriceTotal + burritoPriceTotal 
				+ extraToppingsPriceTotal + chimichangaPriceTotal;
		
		System.out.println("In total, you have ordered:");
		System.out.println(amountTacosOrdered + " tacos,");
		System.out.println(amountEnchiladasOrdered + " enchiladas,");
		System.out.println(amountWatersOrdered + " waters,");
		System.out.println(amountChurrosOrdered + " churros,");
		System.out.println(amountMexicanCandyOrdered + " mexican candy,");
		System.out.println(amountPopsOrdered + " pops,");
		System.out.println(amountNachosOrdered + " nachos,");
		System.out.println(amountBurritosOrdered + " burritos,");
		System.out.println(amountExtraToppingsOrdered + " extra toppings, and ");
		System.out.println(amountChimichangasOrdered + " chimichangas.");
		
		salesTax(totalPrice);
	}
	
	public static void salesTax(double totalPrice)
	{
		double salesTaxPrice = totalPrice * 0.075;
		double salesTaxTPrice = totalPrice + salesTaxPrice;
		String salesTaxTotalPrice = df.format(salesTaxTPrice);
		String totalPriceFormatted = df.format(totalPrice);
		
		System.out.println("Your total price is (without tax) " + totalPriceFormatted);
		System.out.println("Your total price is (with tax) " + salesTaxTotalPrice);
	}

}
