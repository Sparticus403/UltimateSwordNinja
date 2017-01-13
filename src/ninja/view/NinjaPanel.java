package ninja.view;

import ninja.controller.NinjaController;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import ninja.model.Ninja;

public class NinjaPanel extends JPanel
{
	private NinjaController baseController;
	private SpringLayout baseLayout;
	
	public NinjaPanel(NinjaController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		setPreferredSize(new Dimension(900,600));
		this.setBackground(Color.BLUE);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
