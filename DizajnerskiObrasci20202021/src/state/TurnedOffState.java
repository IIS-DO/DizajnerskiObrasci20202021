package state;

public class TurnedOffState implements CarBehavior {
	private Car car;

	public TurnedOffState(Car car) {
		this.car = car;
	}

	@Override
	public void turnOn() {
		car.setCurrentState(car.getTurnedOnState());
		System.out.println("Car is turned on.");
	}

	@Override
	public void turnOff() {
		System.out.println("Car is already turned off.");

	}

	@Override
	public void goIdle() {
		System.out.println("Car is turned off.");

	}

	@Override
	public void move() {
		System.out.println("Car is turned off.");

	}

}
