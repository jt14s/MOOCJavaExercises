package exercise38.noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class NoticeBoardActionListener implements ActionListener {

	private JTextField origin;
	private JLabel target;
	
	public NoticeBoardActionListener(JTextField origin, JLabel target) {
		this.origin = origin;
		this.target = target;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		target.setText(origin.getText());
		origin.setText("");
	}
	
}
