package facade;

public class Radio {
	private Car car;

	public Radio(Car car) {
		this.car = car;
	}

	public String autoTurnOnRadio() {
		if (car.isPreviousState())
			return "Radio is turned on.";
		return "Radio is turned off";
	}

}
