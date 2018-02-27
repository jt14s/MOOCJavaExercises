package exercise39.clicker.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import exercise39.clicker.application.logic.Calculator;

public class ClickerListener implements ActionListener {

	private Calculator calculator;
	private JLabel label;
	
	public ClickerListener(Calculator calc, JLabel label) {
		calculator = calc;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		calculator.increase();
		label.setText(String.valueOf(calculator.giveValue()));
	}	
}
