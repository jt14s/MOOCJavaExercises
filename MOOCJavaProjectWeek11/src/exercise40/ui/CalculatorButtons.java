package exercise40.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import exercise40.logic.AddListener;
import exercise40.logic.ClearListener;
import exercise40.logic.SubtractListener;

public class CalculatorButtons extends JPanel{
	
	private JTextField resultField;
	private JTextField inputField;
	private JButton[] buttons = new JButton[3];
	
	public CalculatorButtons(JTextField resField, JTextField inField) {
		super(new GridLayout(1,3));
		this.resultField = resField;
		this.inputField = inField;

		createComponents();
	}
	
	private void createComponents() {
		buttons[0] = new JButton("+");
		buttons[1] = new JButton("-");
		buttons[2] = new JButton("Z");
		buttons[2].setEnabled(false);
		
		buttons[0].addActionListener(new AddListener(resultField, inputField, buttons[2]));
		buttons[1].addActionListener(new SubtractListener(resultField, inputField, buttons[2]));
		buttons[2].addActionListener(new ClearListener(resultField, inputField, buttons[2]));
		
		add(buttons[0]);
		add(buttons[1]);
		add(buttons[2]);
	}
	
	public JButton[] getButtons() {
		return buttons;
	}
}
