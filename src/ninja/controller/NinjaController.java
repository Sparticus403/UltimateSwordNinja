package ninja.controller;

/**
 * Joe Wrigley
 * 
 * added imports, created ninja controller and made frame appear from todds frame!
 */
import javax.swing.JOptionPane;
import ninja.model.*;
import ninja.view.NinjaFrame;
import java.util.ArrayList;
import ninja.model.Hero;
//10/10 love the name
//your narrator is very observant
public class NinjaController {

	private NinjaFrame ninjaFrame;
	private ArrayList<Enemies> enemyList;
	private ArrayList<Hero> heroList;
	
	
	public NinjaController()
	{
		enemyList = new ArrayList<Enemies>();
		heroList = new ArrayList<Hero>();
		buildEnemyList();
		
		ninjaFrame = new NinjaFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(ninjaFrame, "welcome to SwordNinja!!!!, YOU ARE FIGHTING AN ENEMY GO AND GET EM CHAMP!");
		
		
		if(keepPlaying())
		{
			playGame();	
		}
		else
		{
			JOptionPane.showMessageDialog(ninjaFrame, "YOU DIED, TRY AGAIN ANOTHER TIME");
		}

	}
	
	
	private void buildEnemyList()
	{ 
		enemyList.add(new Bear("Bear"));  //might be fixed when the enemies fully made
		enemyList.add(new Wolf("Wolf"));
		enemyList.add(new Samurai("Samurai"));
	}
	
	public void buildHeroList()
	{
		heroList.add(new Ninja("Ninja"));
	}
	
	public NinjaFrame getNinjaFrame()
	{
		return ninjaFrame;
	}
	
	public ArrayList<Enemies> getEnemyList()
	{
		return enemyList;
	}
	
	public boolean keepPlaying()
	{
		boolean play = true;
		
		Hero heroCurrent = heroList.get(0);
		
		if(heroCurrent.getPlayerHealth() <= 0)
		{
			play = false;
		}
		
		return play;
	}
	
	
	
	public void playGame()
	{
		while(1 < 2)
		{
			
				 while(keepPlaying())
				 {
					 if(keepPlaying())
					 
						 {
					getCurrentEnemy
					 player.getAttackfrombutton
					 
						 monster.currentEnemy(attack)
						 	if(enemyhealth <=0)
					 			{
						 		JOptionPane.showMessageDialog(ninjaFrame, "You killed him. You found nothing. :(");
						 		
						 		JOptionPane.showMessageDialog(ninjaFrame, "Another one appeared though");
						 		getnewenemy
						 		
								 JOptionPane.showMessageDialog(ninjaFrame, "You went home and rested");
								 heroCurrent.setPlayerHealth(30);
								 
								 JOptionPane.showMessageDialog(ninjaFrame, "You went to find another one");
					 			}
					 	
						 	}
				 }
		   
		}
	}
	
//your GUI is pretty nice. i think the idea for ur game is pretty coool!! follow me on instagrame - psaineeraj
	//Are you planning on implementing a random drop?
}
