package edu.amherst.HW3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class Board extends JPanel {
	final static int LINE_WIDTH = 2;
	final static int ROWS = 3;
	final static int COLUMNS = 3;
	final static int SQUARE_SIZE = 150;
	
	Square[] squares = new Square[9];
	
	LineBorder border;
	
	Board(Component f) {
		
		setLayout (new GridLayout(ROWS, COLUMNS, LINE_WIDTH, LINE_WIDTH));
		
		for(Square s : squares) { // init squares
			s = new Square(SQUARE_SIZE);
			add(s);
		}		
		
		border = new LineBorder(Color.BLACK, LINE_WIDTH);
		setBorder(border);
		setBackground(Color.BLACK);
	}
}