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

public class NinjaController {

	private NinjaFrame ninjaFrame;
	private ArrayList<Enemies> enemyList;
	
	
	public NinjaController()
	{
		enemyList = new ArrayList<Enemies>();
		buildEnemyList();
		
		ninjaFrame = new NinjaFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(ninjaFrame, "welcome to SwordNinja!!!!");
	}
	
	
	private void buildEnemyList()
	{ 
		enemyList.add(new Bear("Bear"));  //might be fixed when the enemies fully made
		enemyList.add(new Wolf("Wolf"));
		enemyList.add(new Samurai("Samurai"));
	}
	
	
	public NinjaFrame getNinjaFrame()
	{
		return ninjaFrame;
	}
	
	public ArrayList<Enemies> getEnemyList()
	{
		return enemyList;
	}
	
	
	public void playGame()
	{
		while(1 < 2)
		{
			while(playerHealth > 0)
			{
			while (health > 0)
				{
					randomy eney attack
					your attack
				}
			text that says you go home safe
			}
			text that says you got beatn up brooo
		}
	}
	
	
}
