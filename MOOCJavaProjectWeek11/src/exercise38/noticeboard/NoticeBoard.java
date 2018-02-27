package exercise38.noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class NoticeBoard implements Runnable {

	private JFrame frame;
	
	@Override
	public void run() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(400, 250));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		container.setLayout(new GridLayout(3, 1));
		JTextField textField = new JTextField();
		JButton button = new JButton("Copy!");
		JLabel lable = new JLabel();
		
		NoticeBoardActionListener eventListener = new NoticeBoardActionListener(textField, lable);
		button.addActionListener(eventListener);
		
		container.add(textField);
		container.add(button);
		container.add(lable);
	}

}
