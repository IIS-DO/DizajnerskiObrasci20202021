package mvc;

import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

public class DrawingView extends JPanel {
	private DrawingModel model = new DrawingModel();

	public void setModel(DrawingModel model) {
		this.model = model;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Iterator<Point> it = model.getShapes().iterator();
		while (it.hasNext()) {
			it.next().draw(g);
		}
		// repaint();
		// System.out.println(System.currentTimeMillis());
	}

}
