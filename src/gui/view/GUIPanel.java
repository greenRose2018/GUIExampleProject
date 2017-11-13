package gui.view;

import gui.controller.GUIAppController;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		setupLayout();
		setupListeners();
		changeBackgroundColor();
		
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
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 150, SpringLayout.WEST, this);
	}
	
	/**
	 * this helper method is used to link any GUIcomponents to the associated listener
	 */
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				changeBackgroundColor();
			}
			
		});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
