package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GuiController;
/**
 * 
 * @author ahun0442
 * @version 0.1 11/09/15
 */

public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	
	public GuiPanel (GuiController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Pointless Button");
		firstTextField = new JTextField("words can be typed here");
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	private void setupLayout() //where the code fromthe design tab gos.
	{
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -148, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 43, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 41, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 0, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
