package state;

public class TurnedOnState implements CarBehavior {
	private Car car;

	public TurnedOnState(Car car) {
		this.car = car;
	}

	@Override
	public void turnOn() {
		System.out.println("Car is already turned on.");
	}

	@Override
	public void turnOff() {
		car.setCurrentState(car.getTurnedOffState());
		System.out.println("Car is turned off.");
	}

	@Override
	public void goIdle() {
		car.setCurrentState(car.getIdleState());
		System.out.println("Car is now idle.");

	}

	@Override
	public void move() {
		car.setCurrentState(car.getMovingState());
		System.out.println("Car is moving.");

	}

}
