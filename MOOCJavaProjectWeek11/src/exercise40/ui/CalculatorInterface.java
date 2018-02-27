package exercise40.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class CalculatorInterface implements Runnable {

	private JFrame frame;
	
	@Override
	public void run() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(400,200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		container.setLayout(new GridLayout(3,1));
		JTextField resultField = new JTextField("");
		resultField.setEnabled(false);
		JTextField inputField = new JTextField("0");
		JPanel buttons = new CalculatorButtons(resultField, inputField);
		
		container.add(resultField);
		container.add(inputField);
		container.add(buttons);
	}
}
