package exercise40.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class SubtractListener implements ActionListener {

	private JTextField target;
	private JTextField source;
	private JButton button;
	
	public SubtractListener(JTextField resultField, JTextField inputField, JButton button) {
		this.target = resultField;
		this.source = inputField;
		this.button = button;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (target.getText().equals(""))
			target.setText(source.getText());
		else {
			//todo: check to see if input is an integer
			target.setText( String.valueOf( Integer.valueOf(target.getText()) - Integer.valueOf(source.getText()) ) );
			source.setText("");
		}
		
		if (target.getText().equals("0"))
			button.setEnabled(false);
		else
			button.setEnabled(true);
	}
}
