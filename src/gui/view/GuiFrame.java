package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author ahun0442
 * @version 0.x 11/09/15
 */

public class GuiFrame extends JFrame
{
	private GuiController baseController;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}

}
