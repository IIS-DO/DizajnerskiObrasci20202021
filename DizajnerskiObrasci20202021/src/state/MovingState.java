package state;

public class MovingState implements CarBehavior {
	private Car car;

	public MovingState(Car car) {
		this.car = car;
	}

	@Override
	public void turnOn() {
		System.out.println("Car is already moving.");

	}

	@Override
	public void turnOff() {
		System.out.println("Car is moving.");

	}

	@Override
	public void goIdle() {
		car.setCurrentState(car.getIdleState());
		System.out.println("Car is idle.");

	}

	@Override
	public void move() {
		System.out.println("Car is already moving.");

	}

}
