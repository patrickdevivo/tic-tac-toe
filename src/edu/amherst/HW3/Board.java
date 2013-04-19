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
		
		for(Square[] s : squares) { // init squares
			for (Square a : s) {
				a = new Square(SQUARE_SIZE, this);
				add(a);
			}
		}
		
		border = new LineBorder(Color.BLACK, LINE_WIDTH);
		setBorder(border);
		setBackground(Color.BLACK);
	}
	
	public Boolean checkWin() {
		for(int i = 0; i<ROWS; i++){
			if(squares[i][1]==squares[i][0]&&squares[i][1]==squares[i][2]){
				return true;
			}
		}
		for(int j = 0; j<COLUMNS; j++){
			if(squares[1][j]==squares[0][j]&&squares[1][j]==squares[2][j]){
				return true;
			}
		}
		if(squares[1][1]==squares[0][0]&&squares[1][1]==squares[2][2]) return true;
		if(squares[1][1]==squares[0][2]&&squares[1][1]==squares[2][0]) return true;
		return false;
	}
	
	public Boolean checkFull() {
		return false;
	}
}