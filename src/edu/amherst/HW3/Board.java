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
	
	Square[][] squares = new Square[3][3];
	LineBorder border;
	PlayGround playground;
	
	Board(Component parent) {
		playground = (PlayGround) parent;
		setLayout (new GridLayout(ROWS, COLUMNS, LINE_WIDTH, LINE_WIDTH));
		
		for (int r = 0; r < ROWS; r++)
			for (int c = 0; c < COLUMNS; c++){
				squares[r][c] = new Square(SQUARE_SIZE, this);
				add(squares[r][c]);
			}
		
		border = new LineBorder(Color.BLACK, LINE_WIDTH);
		setBorder(border);
		setBackground(Color.BLACK);
	}
	
	public Boolean checkWin() {
		for(int i = 0; i<ROWS; i++){
			if (squares[i][0].set && squares[i][1].set && squares[i][2].set)
				if(squares[i][1].value==squares[i][0].value&&squares[i][1].value==squares[i][2].value){
					return true;
				}
		}
		for(int j = 0; j<COLUMNS; j++){
			if (squares[0][j].set && squares[1][j].set && squares[2][j].set)
			if(squares[1][j].value==squares[0][j].value&&squares[1][j].value==squares[2][j].value){
				return true;
			}
		}
		
		if (squares[0][0].set && squares[1][1].set && squares[2][2].set)
			if(squares[1][1].value==squares[0][0].value&&squares[1][1].value==squares[2][2].value) return true;
		
		if (squares[2][0].set && squares[1][1].set && squares[0][2].set)
			if(squares[1][1].value==squares[0][2].value&&squares[1][1].value==squares[2][0].value) return true;
		
		return false;
	}
	
	public Boolean checkFull() {
		for (int r = 0; r < ROWS; r++)
			for (int c = 0; c < COLUMNS; c++)
				if (!squares[r][c].set) return false;
		return true;
	}
}