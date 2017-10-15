package PuzzlePlane.controllers;

import PuzzlePlane.models.*;
import PuzzlePlane.views.*;

import java.awt.*;
import java.awt.event.*;

public class ExitPuzzleSolving implements ActionListener{
	PuzzlePlaneGui puzzlePlaneGui;
	
	public ExitPuzzleSolving(PuzzlePlaneGui p) {
		this.puzzlePlaneGui = p;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		this.puzzlePlaneGui.jumpPage("p2");
	}
}