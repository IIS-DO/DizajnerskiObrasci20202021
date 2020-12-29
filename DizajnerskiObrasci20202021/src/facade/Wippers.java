package facade;

public class Wippers {
	private Car car;

	public Wippers(Car car) {
		this.car = car;
	}

	public String autoStartWippers() {
		if (car.isRaining())
			return "Wippers are on.";
		return "Wippers are off.";
	}

}
