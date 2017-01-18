package ninja.model;

public class Samurai extends Enemies{

	
	public Samurai()
	{
		super("Samurai");
	}
	
	public Samurai(String name)
	{
		super(name);
		this.setHealth(122);
	}
}
