package edu.amherst.HW3;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;

class Square extends JPanel {
	
	Boolean set = false;
	int value;
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
			if (!set && board.playground.enabled) {
				if (board.playground.current_player) {
					value = 0;
					board.playground.setBorder(new LineBorder(Color.BLUE, board.LINE_WIDTH));
					board.playground.setBackground(Color.BLUE);
				}
				else {
					value = 1;
					board.playground.setBorder(new LineBorder(Color.RED, board.LINE_WIDTH));
					board.playground.setBackground(Color.RED);
				}
				set = true;
				updateLabel();
				board.playground.updateLabel();			
				board.playground.current_player = !board.playground.current_player;
			}
		}
	}


}
