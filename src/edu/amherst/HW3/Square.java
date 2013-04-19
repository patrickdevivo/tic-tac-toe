package edu.amherst.HW3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

class Square extends JPanel {
	
	int value;
	

	Square(int size) {
		setPreferredSize (new Dimension(size,size));
		setBackground(Color.LIGHT_GRAY);
	}
}
