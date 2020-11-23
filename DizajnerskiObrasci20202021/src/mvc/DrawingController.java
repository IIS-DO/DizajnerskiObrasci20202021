package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import composite.SremBanatBacka;

public class DrawingController {
	private DrawingModel model;
	private DrawingFrame frame;

	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY(), Color.RED);
		model.add(p);

		SremBanatBacka sremBanatBacka = new SremBanatBacka();
		Point srem = new Point(20, 20, Color.BLUE);
		Point banat = new Point(30, 20, Color.BLUE);
		Point backa = new Point(25, 12, Color.BLUE);

		sremBanatBacka.add(srem);
		sremBanatBacka.add(banat);
		sremBanatBacka.add(backa);

		model.add(sremBanatBacka);

		frame.repaint();
	}

}
