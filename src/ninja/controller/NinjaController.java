package ninja.controller;

/**
 * Joe Wrigley
 * partially modified - Todd Williamson
 * added imports, created ninja controller and made frame appear from todds frame!
 */
import javax.swing.JOptionPane;
import ninja.model.*;
import ninja.view.NinjaFrame;
import java.util.ArrayList;
import ninja.model.Hero;
import java.util.Random;
import ninja.view.*;
import java.util.*;
//10/10 love the name
//your narrator is very observant
public class NinjaController 
{
	private NinjaFrame ninjaFrame;
	public ArrayList<Enemies> enemyList;
	public ArrayList<Hero> heroList;
	private Random randomGenerator;
	public NinjaPanel basePanel;
//	 public int buttonDamage;
	public NinjaController()
	{
		enemyList = new ArrayList<Enemies>();
		heroList = new ArrayList<Hero>();
		buildEnemyList();
		buildHeroList();
		randomEnemyFromList();	
		ninjaFrame = new NinjaFrame(this);
	}
	public void start()
	{
		buildEnemyList();
		buildHeroList();
		randomEnemyFromList();
		if(keepPlaying())
		{
			playGame("innitalNoDamage");	
		}
	}
	private void buildEnemyList()
	{ 
		enemyList.add(new Bear("Bear"));
		enemyList.add(new Wolf("Wolf"));
		enemyList.add(new Samurai("Samurai"));
	}
	//gets a random enemy from the enemyList by choosing a random number up to 15.
	//Each enemy has their own specific range of numbers to represent themselves.
	
	
	
	
	
	
	
	
	//startAbstraction
	public Enemies randomEnemyFromList()
	{
		getEnemyList();
		Enemies currentEnemy = enemyList.get(0);
		int randomNumber = (int)(Math.random()*15);
		if(randomNumber <= 6)
		{
			currentEnemy = enemyList.get(1);
		}
		else if(randomNumber > 6 && randomNumber <= 12)
		{
			currentEnemy = enemyList.get(0);
		}
		else if(randomNumber > 12 && randomNumber <= 15)
		{
			currentEnemy = enemyList.get(2);
		}
		enemyList.set(0, currentEnemy);
		return currentEnemy;
	}
	//endAbstraction
	public void buildHeroList()
	{
		heroList.add(new Ninja("Ninja"));
	}
	public ArrayList<Hero> getHeroList()
	{
		return heroList;
	}
	public NinjaFrame getNinjaFrame()
	{
		return ninjaFrame;
	}
	public ArrayList<Enemies> getEnemyList()
	{
		return enemyList;
	}
	public String getName()
	{
		String name = randomEnemyFromList().getName();
		return name;
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
	public int getAttack()
	{
		int damage = heroList.get(0).attack();		
		return damage;
	}
	public int getRangedAttack()
	{
		int damage = heroList.get(0).rangeAttack();
		return damage;
	}
	public int getLuckyAttack()
	{
		int damage = heroList.get(0).luckyHit();
		return damage;
	}
	//startComplexity
	public void playGame(String attackType)
	{
		//randomEnemyFromList();
		String items[] = {"toast","frog meat", "magical sword of kazomodan", "b-ball", "nes system", "kyles favorite food", "egyptian cow", "ninja blade of the third world"};
		List<String> itemList = new ArrayList<String>();
		int damage = 0;
		if (attackType.equals("innitalNoDamage"))
		{
			damage = 0;
		}
		if (attackType.equals("lucky"))
		{
			damage = getLuckyAttack();
		}
		if (attackType.equals("attack"))
		{
			damage = getAttack();
		}
		if (attackType.equals("range"))
		{
			damage = getRangedAttack();
		}
		if(keepPlaying())
		{
			Hero currentHero = heroList.get(0);
			int buttonDamage = damage;
			Enemies currentEnemy = enemyList.get(0);
			currentEnemy.setHealth(currentEnemy.getHealth() - buttonDamage); 
			currentHero.setPlayerHealth(currentHero.getPlayerHealth() - currentEnemy.attack());
			if(currentEnemy.getHealth() <=0)
			{
				itemList.add(items[0]);
				itemList.add(items[1]);
				itemList.add(items[2]);
				itemList.add(items[3]);
				itemList.add(items[4]);
				itemList.add(items[5]);
				itemList.add(items[6]);
				itemList.add(items[7]);
				JOptionPane.showMessageDialog(ninjaFrame, "You killed him. You found  " + itemList.get((int) (Math.random() * 6)) + " item. Wow so cool!");		
				JOptionPane.showMessageDialog(ninjaFrame, "You went home and rested. \n Time to kill another one of those same guys!");
				currentHero.setPlayerHealth(30); 
				enemyList.get(0).setHealth(enemyList.get(0).getMaxHealth());
			}
			if(currentHero.getPlayerHealth() <= 0 )
			{
				JOptionPane.showMessageDialog(ninjaFrame, "You DIED and cant do anything\n Reload to try again.");
				System.exit(0);
			}	 	
		}	
		//endComplexity 
	}
}
