package exercises;
import java.util.Scanner;
public class CellPhoneService {

	public static void main(String[] args) {
		int minutes;
		int text;
		int gigabytes;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many talk minutes do you use per month? ");
		minutes = input.nextInt();
		System.out.println("How many text messages do you send per month? (0 if you don't send any) ");
		text = input.nextInt();
		System.out.println("How many gigabytes of data do you use per month? (0 if you don't use any) ");
		gigabytes = input.nextInt();
		
		if(minutes < 500 && text == 0 && gigabytes == 0)
		{
			System.out.println("We reccomend Plan A, at $49 a month with less than 500 minutes of talk and no data or text.");
		}
		if(minutes < 500 && text > 1)
		{
			System.out.println("We reccomend Plan B, at $55 a month for less than 500 minutes of talk and any text messages.");
		}
		if(minutes >= 500 && text > 1 && gigabytes == 0)
		{
			System.out.println("We reccomend either Plan C at $61 a month with 100 text messages, or Plan D for 100 messages or more "
					+ "at $70 a month.");
		}
		if(gigabytes > .1)
		{
			System.out.println("We reccomend either Plan E for up to 2 gigabytes a month at $79, or Plan F for more than 2 gigabytes"
					+ " at $87.");
		}
		
		
	}

}
