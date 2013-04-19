package edu.amherst.HW3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class PlayGround extends JPanel {

	JLabel label = new JLabel();
	Board board;
	Boolean current_player = false;
	
	PlayGround() {
		super(new FlowLayout(FlowLayout.CENTER, 50, 50));
		board = new Board(this);
		add(board);
		
		label.setText("Player X goes first");
		add(label);
	}
	
	public void updateLabel() {
		String player;
		if (current_player) player = "X";
		else player = "O";
		label.setText("Player " + player + "'s turn.");
	}

}
