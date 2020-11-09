package mvc;

import java.util.ArrayList;

public class DrawingModel {
	private ArrayList<Point> shapes = new ArrayList<Point>();

	public ArrayList<Point> getShapes() {
		return shapes;
	}

	public void add(Point p) {
		shapes.add(p);
	}

	public void remove(Point p) {
		shapes.remove(p);
	}

	public Point get(int index) {
		return shapes.get(index);
	}

}
