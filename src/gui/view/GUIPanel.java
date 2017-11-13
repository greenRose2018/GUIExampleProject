package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		baseLayout= new SpringLayout();
		setupPanel();
	}
	
	/**
	 * used to add all components to the subclass of JPanel
	 * this installs them into the panel so they are seen in the GUI.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.green);
		this.setLayout(baseLayout);
		this.add(firstButton);
		
	}
	
	/**
	 * This is used to hold all the layout and arrangement code for SpringLayout.
	 */
	private void setupLayout()
	{
		
	}
	
	/**
	 * this helper method is used to link any GUIcomponents to the associated listener
	 */
	private void setupListeners()
	{
		
	}
}
