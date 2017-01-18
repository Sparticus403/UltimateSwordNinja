package ninja.model;

public class Ninja extends Enemies {

	public Ninja()
	{
		super("Your Ninja");
	}
	
	public Ninja(String name)
	{
		super(name);
		this.setHealth(5);
	}
}
