package ninja.view;

import ninja.controller.NinjaController;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import ninja.model.ninja;
/**
 * 
 * @author Todd Williamson
 *
 */
public class NinjaPanel extends JPanel
{
	private NinjaController baseController;
	private SpringLayout baseLayout;
	private JButton attackButton;
	private JButton fleeButton;
	private JButton rangeAttackButton;
	private JLabel attackLabel;
	
	public NinjaPanel(NinjaController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.attackButton = new JButton("Attack");
		this.rangeAttackButton = new JButton("Range Attack");
		this.fleeButton = new JButton("Smoke Bombs");
		this.attackLabel = new JLabel("Use: ");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		setPreferredSize(new Dimension(900,600));
		this.setBackground(Color.BLUE);
		
		this.add(attackButton);
		this.add(rangeAttackButton);
		this.add(fleeButton);
		this.add(attackLabel);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, attackButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, attackButton, -99, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rangeAttackButton, 0, SpringLayout.NORTH, attackButton);
		baseLayout.putConstraint(SpringLayout.WEST, rangeAttackButton, 6, SpringLayout.EAST, attackButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fleeButton, 0, SpringLayout.NORTH, attackButton);
		baseLayout.putConstraint(SpringLayout.WEST, fleeButton, 6, SpringLayout.EAST, rangeAttackButton);
		baseLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, attackButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -6, SpringLayout.NORTH, attackButton);
		
	}
	
	private void setupListeners()
	{
		
	}

}
