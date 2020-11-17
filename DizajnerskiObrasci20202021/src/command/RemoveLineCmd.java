package command;

import mvc.DrawingModel;
import mvc.Line;

public class RemoveLineCmd implements Command {
	private Line line;
	private DrawingModel model;

	public RemoveLineCmd(Line line, DrawingModel model) {
		this.line = line;
		this.model = model;
	}

	@Override
	public void execute() {
		model.remove(line);

	}

	@Override
	public void unexecute() {
		model.add(line);

	}

}
