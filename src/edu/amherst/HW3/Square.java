package edu.amherst.HW3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Square extends JPanel {
	
	int value = 2;
	Board board;
	JLabel label;

	Square(int size, Board parent) {
		board = parent;
		setPreferredSize (new Dimension(size,size));
		setBackground(Color.WHITE);
		
		label = new JLabel("");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setFont(new Font("Sans-Serif", Font.PLAIN, 110));
//		label.setForeground(Color.BLUE);
		
		add(label);
		
		addMouseListener(new Listener());
	}
	
	public void updateLabel() {
		if (value == 1) label.setText("X");
		if (value == 0) label.setText("O");
	}
	
	class Listener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (value == 2) {
				if (board.playground.current_player) value = 0;
				else value = 1;
				updateLabel();
				board.playground.updateLabel();
				System.out.println(board.checkWin());
				board.playground.current_player = !board.playground.current_player;
			}
		}
	}


}
