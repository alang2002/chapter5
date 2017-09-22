package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		final double SKILL_LEVEL_1_PAY = 17.00;
		final double SKILL_LEVEL_2_PAY = 20.00;
		final double SKILL_LEVEL_3_PAY = 22.00;
		double hoursPerWeek;
		double over40HoursPay;
		double pay = 17.00;
		double netIncome;
		int skillLevel;
		String insurance;
		String retirementYes;
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
		
		if(skillLevel == 2 || skillLevel == 3)
		{
			System.out.println("Select your insurance option: ");
			System.out.println("Medical Insurance ($32.50 per week) "
					+ "\nDental Insurance ($20.00 per week) "
					+ "\nLong-term disability Insurance ($10.00)"
					+ "\nEnter Medical for medical insurance, Dental for dental insurance, and Disability for "
					+ "Long-term disability insurance.");
			insurance = input.next();
			if(skillLevel == 3)
			{
				System.out.println("Enter Yes if you want to participate in the retirement plan (3% of gross pay) >> ");
				retirementYes = input.next();
				if("Yes".equalsIgnoreCase(retirementYes))
				{
					retirementYes = "Yes";
				}
			}
		}
		if(hoursPerWeek > 40)
		{
			pay = pay * 1.5;
		}

	}
}
