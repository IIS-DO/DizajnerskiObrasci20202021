package state;

public class Car implements CarBehavior {
	private TurnedOffState turnedOffState;
	private TurnedOnState turnedOnState;
	private IdleState idleState;
	private MovingState movingState;

	public CarBehavior currentState;

	public Car() {
		turnedOffState = new TurnedOffState(this);
		turnedOnState = new TurnedOnState(this);
		idleState = new IdleState(this);
		movingState = new MovingState(this);

		currentState = turnedOffState;
	}

	public TurnedOffState getTurnedOffState() {
		return turnedOffState;
	}

	public void setTurnedOffState(TurnedOffState turnedOffState) {
		this.turnedOffState = turnedOffState;
	}

	public TurnedOnState getTurnedOnState() {
		return turnedOnState;
	}

	public void setTurnedOnState(TurnedOnState turnedOnState) {
		this.turnedOnState = turnedOnState;
	}

	public IdleState getIdleState() {
		return idleState;
	}

	public void setIdleState(IdleState idleState) {
		this.idleState = idleState;
	}

	public MovingState getMovingState() {
		return movingState;
	}

	public void setMovingState(MovingState movingState) {
		this.movingState = movingState;
	}

	public CarBehavior getCurrentState() {
		return currentState;
	}

	public void setCurrentState(CarBehavior currentState) {
		this.currentState = currentState;
	}

	@Override
	public void turnOn() {
		currentState.turnOn();
	}

	@Override
	public void turnOff() {
		currentState.turnOff();
	}

	@Override
	public void goIdle() {
		currentState.goIdle();
	}

	@Override
	public void move() {
		currentState.move();
	}

}
