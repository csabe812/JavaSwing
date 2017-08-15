package hu.csfulop.javaswing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainWindow(String title) {
		super(title);
		this.setSize(800, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		this.setVisible(true);
	}

}
