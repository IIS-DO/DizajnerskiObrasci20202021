package composite;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mvc.Shape;

public class SremBanatBacka extends Shape {
	private List<Shape> sremBanatBacka = new ArrayList<Shape>();

	public void add(Shape s) {
		sremBanatBacka.add(s);
	}

	public void remove(Shape s) {
		sremBanatBacka.remove(s);
	}

	@Override
	public void draw(Graphics g) {
		Iterator<Shape> it = sremBanatBacka.iterator();
		while (it.hasNext()) {
			it.next().draw(g);
		}
	}

}
