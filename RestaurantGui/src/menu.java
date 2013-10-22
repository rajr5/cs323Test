import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.FlowLayout;

import javax.swing.JTextArea;

import java.awt.ScrollPane;
import java.awt.CardLayout;

import javax.swing.JList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;

//import RPSGui.buttonListener;

import java.awt.GridLayout;

public class menu extends JFrame
{
	private JTabbedPane menu;
	private JPanel panel;
	private ImageIcon[] menuButtonsImage;
	private JPanel panel_1;
	private JPanel panel_4;
	private JButton[] menuButtons;
	private JSeparator separator;
	
	public menu()
	{
		menu = new JTabbedPane(JTabbedPane.TOP);
		panel = new JPanel();
		panel_1 = new JPanel();
		panel_4 = new JPanel();
		menuButtons = new JButton[64];
		separator = new JSeparator();
		
		separator.setBounds(432, 259, 1, 12);
		panel_1.add(separator);
		
		// еееееееееееееееееееееееееее Load images
		// ееееееееееееееееееееееееееееееее
		menuButtonsImage = new ImageIcon[64];
		for (int i = 0; i < menuButtonsImage.length; i++) 
		{
			menuButtonsImage[i] = new ImageIcon("./src/Unknown.jpeg");

		}
		
		// adds menu buttons to grid menu
				for (int j = 0; j < menuButtons.length; j++) {
					menuButtons[j] = new JButton(menuButtonsImage[j]);
					panel_4.add(menuButtons[j]);
					menuButtons[j].addActionListener(new buttonListener());
				}
				
		menu.addTab("Menu", null, panel_1, null);
		panel_1.setLayout(null);
		//----------------END load images-----------------------
		
		panel_4.setBounds(6, 6, 810, 810);
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(8, 8, 2, 2));
		
		
	}
	
	public JTabbedPane m()
	{
		return menu;
	}
	
	private class buttonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent event) 
		{
			if (event.getSource() == menuButtons[0]) {

				System.out.println("button 0 wrks");// btnGetIt
			} else if (event.getSource() == menuButtons[1]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[2]) {
				System.out.println("button 2 wrks");
			} else if (event.getSource() == menuButtons[3]) {
				System.out.println("button 3 wrks");
			} else if (event.getSource() == menuButtons[4]) {
				System.out.println("button 4 wrks");
			} else if (event.getSource() == menuButtons[5]) {
				System.out.println("button 5 wrks");
			} else if (event.getSource() == menuButtons[6]) {
				System.out.println("button 6 wrks");
			} else if (event.getSource() == menuButtons[7]) {
				System.out.println("button 7 wrks");
			} else if (event.getSource() == menuButtons[8]) {
				System.out.println("button 8 wrks");
			} else if (event.getSource() == menuButtons[9]) {
				System.out.println("button 9 wrks");
			} else if (event.getSource() == menuButtons[10]) {
				System.out.println("button 10 wrks");
			} else if (event.getSource() == menuButtons[11]) {
				System.out.println("button 11 wrks");
			} else if (event.getSource() == menuButtons[12]) {
				System.out.println("button 12 wrks");
			} else if (event.getSource() == menuButtons[13]) {
				System.out.println("button 13 wrks");
			} else if (event.getSource() == menuButtons[14]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[15]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[16]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[17]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[18]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[19]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[20]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[21]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[22]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[23]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[24]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[25]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[26]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[27]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[28]) {
				System.out.println("button 1 wrks");
			} else if (event.getSource() == menuButtons[29]) {
				System.out.println("button 1 wrks");
			}
		}
	}

}
