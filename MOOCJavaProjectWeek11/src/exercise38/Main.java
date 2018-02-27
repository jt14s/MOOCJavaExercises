package exercise38;

import javax.swing.SwingUtilities;

import exercise38.noticeboard.NoticeBoard;

class Main {

	public static void main(String[] args) {
		NoticeBoard ui = new NoticeBoard();
		SwingUtilities.invokeLater(ui);
	}
}
