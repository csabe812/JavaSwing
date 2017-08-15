package hu.csfulop.javaswing;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainWindow extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param title the title of the frame
	 * This method creates the frame and the menu
	 */
	public MainWindow(String title) {
		super(title);
		this.setSize(800, 600);
		initMenuBar();
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
		this.setVisible(true);
	}

	/**
	 * This method creates the whole menu (including the menubar - menu - menu item)
	 */
	public void initMenuBar() {
		JMenuBar jmb = new JMenuBar();
		JMenu jm = new JMenu("Menu - 1");
		JMenuItem jmi = new JMenuItem("Menu Item - 1");
		jmi.addActionListener(this);
		jm.add(jmi);
		jmb.add(jm);
		setJMenuBar(jmb);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Menu: " + e.getActionCommand() + " has been pressed");
	}
	
}
