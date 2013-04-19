package edu.amherst.HW3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class PlayGround extends JPanel implements ActionListener {

	Board board;
	
	PlayGround() {
		super(new FlowLayout(FlowLayout.CENTER, 50, 50));
		board = new Board(this);
		add(board);
	}

	public void actionPerformed (ActionEvent e) {

	}
}
