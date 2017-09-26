package gameZone;

import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Random rand = new Random();
		int random = rand.nextInt(3) + 1;
		String choice;
		int choiceNumber;
		
		choice = JOptionPane.showInputDialog(null, "Enter 1 for paper, 2 for rock, and 3 for scissors.");
		choiceNumber = Integer.parseInt(choice);
		
		if(choiceNumber == 1 && random == 1)
		{
			JOptionPane.showMessageDialog(null, "Paper against paper = tie!");
		}
		if(choiceNumber == 1 && random == 2)
		{
			JOptionPane.showMessageDialog(null, "Paper against rock = you win!");
		}
		if(choiceNumber == 1 && random == 3)
		{
			JOptionPane.showMessageDialog(null, "Paper against scissors = you lose!");
		}
		if(choiceNumber == 2 && random == 1)
		{
			JOptionPane.showMessageDialog(null, "Rock against paper = you lose!");
		}
		if(choiceNumber == 2 && random == 2)
		{
			JOptionPane.showMessageDialog(null, "Rock against rock = tie!");
		}
		if(choiceNumber == 2 && random == 3)
		{
			JOptionPane.showMessageDialog(null, "Rock against scissors = you win!");
		}
		if(choiceNumber == 3 && random == 1)
		{
			JOptionPane.showMessageDialog(null, "Scissors against paper = you win!");
		}
		if(choiceNumber == 3 && random == 2)
		{
			JOptionPane.showMessageDialog(null, "Scissors against rock = you lose!");
		}
		if(choiceNumber == 3 && random == 3)
		{
			JOptionPane.showMessageDialog(null, "Scissors against scissors = tie!");
		}
			
		
	}

}
