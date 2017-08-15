package hu.csfulop.javaswing.dialogs;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import hu.csfulop.javaswing.config.DataClass;

public class NewGameDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private GridLayout gridLayout;
	
	public NewGameDialog() {
		this.setTitle(DataClass.newGameDialog);
		this.gridLayout = new GridLayout(4, 2);
		this.setLayout(this.gridLayout);
		initItems();
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void initItems() {
		JLabel jl = new JLabel(DataClass.playerOne);
		this.add(jl);
		JTextField jtf = new JTextField();
		this.add(jtf);
		jl = new JLabel(DataClass.playerTwo);
		this.add(jl);
		jtf = new JTextField();
		this.add(jtf);
		jl = new JLabel(DataClass.newPlayer);
		this.add(jl);
		JButton jb = new JButton(DataClass.newPlayerButton);
		this.add(jb);
		jb.addActionListener(this);
		jb = new JButton(DataClass.okButton);
		this.add(jb);
		jb.addActionListener(this);
		jb = new JButton(DataClass.cancelButton);
		this.add(jb);
		jb.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().toUpperCase().equals("CANCEL")) {
			this.setVisible(false);
		}
	}
	
}
