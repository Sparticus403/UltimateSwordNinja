package ninja.model;

public class Bear extends Enemies 
{

	public Bear()
	{
		super("Bear");
	}
	
	public Bear(String name)
	{
		super(name);
		this.setHealth(10);
	}
	
	
	
}
