package gui.controller;

import gui.controller.GuiController;

/**
 * Starts the Program.
 * @author Alex Huntsman
 * @version 0.x 11/09/15
 */

public class GuiRunner 
{
	public static void main (String [] args)
	{		
		GuiController myGuiController = new GuiController();	
		myGuiController.start();
	}

}
