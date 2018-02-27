package exercise40.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ClearListener implements ActionListener {

	private JTextField target;
	private JTextField source;
	private JButton button;
	
	public ClearListener(JTextField resultField, JTextField inputField, JButton button) {
		this.target = resultField;
		this.source = inputField;
		this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		target.setText("");
		source.setText("");
		button.setEnabled(false);
	}
}
