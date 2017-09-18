package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice {

//Door Choice
//Author: Aaron Lang
	
	public static void main(String[] args) {
		//Door Prize program
		String choiceString;
		int doorChoice;
		
		choiceString = JOptionPane.showInputDialog(null, "Pick a door out of 1, 2, or 3.",
				"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);
		
		//if statement structure for door choice
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win nothing! ECKSDEE");
		}
		if(doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null, "You win less than nothing!");
		}
		if(doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null, "GET REKT");
		}
		else
			JOptionPane.showMessageDialog(null, "That is not an option, please try again.");

	}

}
