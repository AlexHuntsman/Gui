package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
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
	
	
	public GuiPanel (GuiController baseController)
	{
		this.baseController = baseController;
		
		firstButton = new JButton("Pointless Button");
		firstTextField = new JTextField("words can be typed here");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
