package hu.csfulop.javaswing;

import javax.swing.*;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainWindow(String title) {
		super(title);
		this.setSize(800, 600);
		initMenuBar();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
