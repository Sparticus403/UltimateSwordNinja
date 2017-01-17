package ninja.model;

/**
 * 
 * @author joey wrigley / todd williamson
 * Both assisted in adding the code to making hp and attack work as well with names!
 *
 */
public abstract class Enemies {
	
	private int health;
	private int attack;
	private String name;
	
	
	public Enemies(String name)
	{
		this.name = name;
	}
	
	
	public int getHealthPoints()
	{
		return health;
	}
	
	public int getAttackPoints()
	{
		return attack;
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
