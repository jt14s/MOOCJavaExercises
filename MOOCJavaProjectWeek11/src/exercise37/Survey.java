package exercise37;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Survey implements Runnable {

	private JFrame frame;

	@Override
	public void run() {
		frame = new JFrame("Survey");
		frame.setPreferredSize(new Dimension(250,250));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		
		container.add(new JLabel("Are you?"));
		container.add(new JCheckBox("Yes!"));
		container.add(new JCheckBox("No!"));
		
		container.add(new JLabel("Why?"));
		ButtonGroup reasonButtons = new ButtonGroup();
		JRadioButton firstReason = new JRadioButton("No reason.");
		JRadioButton secondReason = new JRadioButton("Because it is fun!");
		reasonButtons.add(firstReason);
		reasonButtons.add(secondReason);
		container.add(firstReason);
		container.add(secondReason);
		
		container.add(new JButton("Done!"));
	}

}
