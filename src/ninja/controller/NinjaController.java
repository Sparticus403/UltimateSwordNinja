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
	
	
	
	public NinjaController()
	{
		ninjaFrame = new NinjaFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(ninjaFrame, "welcome to SwordNinja!!!!");
	}
	
	
	public NinjaFrame getNinjaFrame()
	{
		return ninjaFrame;
	}
	
	
	
	
	
	
	
}
