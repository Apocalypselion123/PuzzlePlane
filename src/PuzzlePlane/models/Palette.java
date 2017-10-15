package PuzzlePlane.models;

import java.awt.*;
import java.util.ArrayList;


public class Palette {
	ShapeSet shapeSet;
	
	ArrayList<PlacedShape> shapes = new ArrayList<PlacedShape>();
	ArrayList<Point> shapePos = new ArrayList<Point>(); //Fixed Positions
	int order;
	
	public Palette( ) {
		Point firstPos = new Point();
		firstPos.setLocation(20.0, 50.0);
		this.shapePos.add(firstPos);
		this.order = 0;
	}
	
	public void setPosition(int x, int y, int o) {
		this.shapes.get(o).setPosition(x, y);
	}
	
	public void initialAddShape(PolyShape s) {
		PlacedShape placedShape = new PlacedShape(this.shapePos.get(0), s, false, false, 0, this.order, true);
		this.shapes.add(placedShape);
		this.order += 1;
	}
	
	public void addPlacedShape(PlacedShape s) {
		this.shapes.add(s);
	}
	
	public void removePlacedShape(PlacedShape s) {
		this.shapes.remove(s);
	}
	
	public ArrayList<PlacedShape> getShapes() {
		return this.shapes;
	}
	
	public void removeShape() {
		
	}
}