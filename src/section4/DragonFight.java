package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 300;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 300;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		//while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
	
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		while(playerHealth>0 && dragonHealth>0)
		{
		String ask = JOptionPane.showInputDialog(null, "Do you want to attack the dragon with a punch and heal or a kick?");
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		if(ask.equals("punch and heal")) 
		{
			Random punch = new Random();
			int punchvalue = punch.nextInt(10);
			Random heal = new Random();
			int healvalue = heal.nextInt(15);
			dragonDamage += punchvalue;
			dragonHealth= dragonHealth - dragonDamage;
			playerHealth+= healvalue;
			System.out.println("The total health you healed is" + healvalue);
			System.out.println("The total damage you did to the dragon is" + dragonDamage);
			System.out.println("The health the dragon has is :" + dragonHealth);
		}
		// 9. If they typed in "yell":
		
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if(ask.equals("kick")) 
		{
			Random kick = new Random();
			int kickvalue = kick.nextInt(20);
			dragonDamage+= kickvalue;
			dragonHealth= dragonHealth - dragonDamage;
			System.out.println("The total damage you did to the dragon is:" + dragonDamage);
			System.out.println("The health the dragon has is :" + dragonHealth);
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		Random  dragonBreath = new Random();
		int dragonBreathvalue = dragonBreath.nextInt(25);
		playerDamage+=dragonBreathvalue;
		playerHealth = playerHealth-playerDamage;
		System.out.println("The total damage he did to you is:" + playerDamage);
		System.out.println("The health you have is :" + playerHealth);
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth <= 0) 
		{
			JOptionPane.showMessageDialog(null, "You lost");
		}
		else if(dragonHealth<= 0)
		{
			JOptionPane.showMessageDialog(null,"You WON! Enjoy your freedom! BYE!");
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			}
		}
	}

