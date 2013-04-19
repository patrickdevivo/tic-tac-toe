package edu.amherst.HW3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class TicTacToe extends JFrame {
	
	TicTacToe() {
		super("Tic Tac Toe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new PlayGround());
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new TicTacToe();
	}

}
