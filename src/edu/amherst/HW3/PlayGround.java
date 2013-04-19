package edu.amherst.HW3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class PlayGround extends JPanel implements ActionListener {

	JLabel label = new JLabel();
	JButton reset = new JButton("Reset");
	Board board;
	Boolean current_player = false;
	Boolean enabled = true;
	TicTacToe game;
	
	PlayGround(TicTacToe p) {
		super(new FlowLayout(FlowLayout.CENTER, 50, 50));
		board = new Board(this);
		add(board);
		
		label.setText("Player X goes first");
		add(label);
		
		add(reset);
		reset.addActionListener(this);
		
		game = p;
	}
	
	public void updateLabel() {
		String player;
		String winner;
		if (current_player) {
			player = "X";
			winner = "O";
		}
		else {
			player = "O";
			winner = "X";
		}
		label.setText("Player " + player + "'s turn.");

		if (!board.checkWin() && board.checkFull()) {
			label.setText("Game is a draw!");
			enabled = false;
			board.setBorder(new LineBorder(Color.YELLOW, board.LINE_WIDTH));
			board.setBackground(Color.YELLOW);
		}
		
		if (board.checkWin()) {
			label.setText("Player " + winner + " wins!!");
			enabled = false;
			board.setBorder(new LineBorder(Color.GREEN, board.LINE_WIDTH));
			board.setBackground(Color.GREEN);
		}

	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource().equals(reset)) game.reset();
	}

}
