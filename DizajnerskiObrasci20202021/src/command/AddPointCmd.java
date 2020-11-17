package command;

import mvc.DrawingModel;
import mvc.Point;

public class AddPointCmd implements Command {
	private Point point;
	private DrawingModel model;

	public AddPointCmd(Point point, DrawingModel model) {
		this.point = point;
		this.model = model;
	}

	@Override
	public void execute() {
		model.add(point);
	}

	@Override
	public void unexecute() {
		model.remove(point);

	}

}
