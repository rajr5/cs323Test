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
//I added some notes here for testing purposes

import java.awt.GridLayout;


public class kitchen extends JFrame 
{
	
	private int testInt = 5;
	private JTabbedPane kitchen;
	private JPanel panel_3;
	public kitchen()
	{
		kitchen = new JTabbedPane(JTabbedPane.TOP);
		panel_3 = new JPanel();
		
		kitchen.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
	}

	public JTabbedPane k()
	{
		return kitchen;
	}
}
