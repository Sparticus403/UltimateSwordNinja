package ninja.model;

public class Wolf extends Enemies{

	

	public Wolf()
	{
		super("Wolf");
	}
	
	public Wolf(String name)
	{
		super(name);
		this.setHealth(1);
	}
}
