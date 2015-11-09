package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;

/**
 * 
 * @author ahun0442
 * @version 0.2 11/09/15 updated the setupFrame to load the contentPane with a GuiPanel
 */

public class GuiFrame extends JFrame
{
	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 	// Must be the first line of setupFrame! - Installs the panel in the frame.
		this.setSize(400,400);				//find a good size for the app.
		this.setTitle("silly app");
		this.setResizable(false); 			//Advisable but required.
		this.setVisible(true); 				// Must be the Last line of setupFrame!
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}

}
