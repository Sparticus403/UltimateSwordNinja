package ninja.model;

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
