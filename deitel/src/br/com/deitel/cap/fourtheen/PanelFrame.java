package br.com.deitel.cap.fourtheen;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {
	private JPanel buttonPanel;
	private JButton[] buttons;
	
	public PanelFrame() {
		super("Panel Demo");
		buttons = new JButton[5];
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, buttons.length));
		
		for (int count = 0; count < buttons.length; count++) {
			buttons[count] = new JButton("Button " + (count + 1));
			buttonPanel.add(buttons[count]);
		}
		
		add(buttonPanel, BorderLayout.SOUTH);
	}
}
