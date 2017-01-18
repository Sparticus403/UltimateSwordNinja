package ninja.model;

public abstract class Hero {
	/**
	 * Joe Wrigley
	 * made all inside methods and declarations
	 */
	private int health;
	private String name;
	
	
	public Hero(String name)
	{
		this.name = name;
	}
	
	
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}

	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}


