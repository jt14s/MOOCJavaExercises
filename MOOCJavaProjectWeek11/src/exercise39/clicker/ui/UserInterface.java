package exercise39.clicker.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import exercise39.clicker.application.logic.Calculator;

public class UserInterface implements Runnable {

	private Calculator calculator;
	private JFrame frame;
	
	public UserInterface(Calculator calc) {
		calculator = calc;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Click Effect");
		frame.setPreferredSize(new Dimension(200, 100));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		container.setLayout(new BorderLayout());
	
		JLabel label = new JLabel(String.valueOf(calculator.giveValue()));
		JButton button = new JButton("Click!");
		ClickerListener actionListener = new ClickerListener(calculator, label);
		
		button.addActionListener(actionListener);
		
		container.add(label, BorderLayout.CENTER);
		container.add(button, BorderLayout.SOUTH);
	}
}
