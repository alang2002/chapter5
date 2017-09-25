package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		final double SKILL_LEVEL_1_PAY = 17.00;
		final double SKILL_LEVEL_2_PAY = 20.00;
		final double SKILL_LEVEL_3_PAY = 22.00;
		final double medical = 32.50;
		final double dental = 20.00;
		final double disability = 10.00;
		boolean yesMedical = false;
		boolean yesDental = false;
		boolean yesDisability = false;
		int holder;
		double hoursPerWeek;
		double pay = 17.00;
		double overtimePay = 0;
		double netIncome;
		int skillLevel;
		String insurance = null;
		boolean retirementYes = false;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter skill level >> ");
		skillLevel = input.nextInt();
		System.out.println("Enter hours worked this week >> ");
		hoursPerWeek = input.nextDouble();
		
		if(skillLevel == 1)
		{
			pay = SKILL_LEVEL_1_PAY;
		}
		if(skillLevel == 2)
		{
			pay = SKILL_LEVEL_2_PAY;
		}
		if(skillLevel == 3)
		{
			pay = SKILL_LEVEL_3_PAY;
		}
		if(skillLevel >= 4)
		{
			System.out.println("That is not a valid skill level, please try again.");
			System.out.println("Enter skill level >> ");
			skillLevel = input.nextInt();
		}
		
		
		if(skillLevel == 2 || skillLevel == 3)
		{
			System.out.println("Select your insurance option: ");
			System.out.println("Medical Insurance ($32.50 per week) "
					+ "\nDental Insurance ($20.00 per week) "
					+ "\nLong-term disability Insurance ($10.00)"
					+ "\nSelect '1' for medical, '2' for dental, and '3' for disability (4 for no insurance plan).");
			holder = input.nextInt();
			
			
			if(holder == 1)
			{
				String selection;
				yesMedical = true;
				System.out.println("Would you like to select another insurance plan? "
						+ "\n the remaining options are Dental (20.00 per week) and Disability (10.00 per week)."
						+ "\n(Yes/No)");
				selection = input.next();
				if("Yes".equalsIgnoreCase(selection))
				{
					System.out.println("Select your plan: "
							+ "\n1 for Disability"
							+ "\n2 for Dental");
					if(holder == 2)
					{
						yesDental = true;
						System.out.println("Would you like the disability package as well? (Yes/No) ");
						selection = input.next();
						if("Yes".equalsIgnoreCase(selection))
						{
							yesDisability = true;
						}
						else
						{
							yesDisability = false;
						}
					}
					if(holder == 1)
					{
						yesDisability = true;
						System.out.println("Would you like the dental package as well? (Yes/No) ");
						selection = input.next();
						if("Yes".equalsIgnoreCase(selection))
						{
							yesDental = true;
						}
						else
						{
							yesDental = false;
						}
						
					}
					
				}
				if("No".equalsIgnoreCase(selection))
				{
					yesDental = false;
					yesDisability = false;
				}
			}
			
			
			
			if(holder == 2)
			{
				yesDental = true;
				String selection;
				System.out.println("Would you like to select another insurance plan? "
						+ "\n the remaining options are Medical (32.50 per week) and Disability (10.00 per week)."
						+ "\n(Yes/No)");
				selection = input.next();
				if("Yes".equalsIgnoreCase(selection))
				{
					System.out.println("Select your plan: "
							+ "\n1 for Medical"
							+ "\n2 for Disability");
					holder = input.nextInt();
					if(holder == 2)
					{
						yesDisability = true;
						System.out.println("Would you like the medical package as well? (Yes/No) ");
						selection = input.next();
						if("Yes".equalsIgnoreCase(selection))
						{
							yesMedical = true;
						}
						else
						{
							yesMedical = false;
						}
						
					}
					if(holder == 1)
					{
						yesMedical = true;
						System.out.println("Would you like the disability package as well? (Yes/No)");
						selection = input.next();
						if("Yes".equalsIgnoreCase(selection))
						{
							yesDisability = true;
						}
						else
						{
							yesDisability = false;
						}
					}
				}
				if("No".equalsIgnoreCase(selection))
				{
					yesMedical = false;
					yesDisability = false;
				}
			}
					
						
					
			if(holder == 3)
			{
				yesDisability = true;
				String selection;
				System.out.println("Would you like to select another insurance plan? "
						+ "\n the remaining options are Medical (32.50 per week) and Dental (20.00 per week)."
						+ "\n(Yes/No)");
				selection = input.next();
				if("Yes".equalsIgnoreCase(selection))
				{
					System.out.println("Select your plan: "
							+ "\n1 for Medical"
							+ "\n2 for Dental");
					holder = input.nextInt();
					if(holder == 1)
					{
						yesMedical = true;
						System.out.println("Would you like the dental package as well? (Yes/No)");
						selection = input.next();
						if("Yes".equalsIgnoreCase(selection))
						{
							yesDental = true;
						}
						else
						{
							yesDental = false;
						}
					}
				}
				if("No".equalsIgnoreCase(selection))
				{
					yesMedical = false;
					yesDisability = false;
				}
			}
			
			
			
			if(holder == 4)
				yesDisability = false;
				yesMedical = false;
				yesDental = false;
				
		}
			
			
		
			
			if(skillLevel == 3)
			{
				System.out.println("Enter Yes if you want to participate in the retirement plan (3% of gross pay) >> ");
				insurance = input.next();
				retirementYes = true;
				pay = pay * 0.03;
			}
		
		
				
		System.out.println("You have worked " + hoursPerWeek + " hours this week.");
		System.out.println("You have an hourly pay rate of " + pay + ".");
		System.out.println("The regular pay for 40 hours is " + pay * 40 + ".");
		if(hoursPerWeek > 40)
		{
			overtimePay = pay * 1.5;
			System.out.println("You are being paid " + overtimePay + " for overtime.");
		}
		netIncome = overtimePay + pay;
		System.out.println("Your total pay for overtime hours (if applicable) and regular hours is: " + netIncome);
		System.out.println("Your total pay may be affected by your retirement plan if you chose one.");
		if(yesMedical == true)
		{
			netIncome = netIncome - 32.50;
			if(yesDental == true)
			{
				netIncome = netIncome - 20.00;
			}
			if(yesDisability == true)
			{
				netIncome = netIncome - 10.00;
			}
		}
		if(yesDental == true)
		{
			netIncome = netIncome - 20.00;
			if(yesMedical == true)
			{
			netIncome = netIncome - 32.50;
			}
			if(yesDisability == true)
			{
			netIncome = netIncome - 10.00;
			}
		}
		if(yesDisability == true)
		{
		netIncome = netIncome - 10.00;
			if(yesDental == true)
			{
				netIncome = netIncome - 20.00;
			}
			if(yesMedical == true)
			{
			netIncome = netIncome - 32.50;
			}
		}
		System.out.println("Your total for the week is " + netIncome);
		if(netIncome <= 0)
		{
			System.out.println("ERROR, INSUFFICENT FUNDS");
		}


	
}
}

