package ninja.model;
/**
 * 
 * @author Joe Wrigley
 *Created methods to create the objects within here, and give stats / moves.
 */
public class Ninja extends Hero {

	public Ninja()
	{
		super("Your Ninja");
	}
	
	public Ninja(String name)
	{
		super(name);
		this.setHealth(30);
	}
	
	public int luckyHit()
	{
		return (int) (Math.random() * 20) + 1;
	}
	
	public int rangeAttack()
	{
		return 5;
	}
	
	public int attack()
	{
		return this.getHealth() / (5/2);
	}
}
