package facade;

public class Car {
	private int remoteCode = 1234;
	private String carKey = "sara";
	private boolean isRaining = false;
	private boolean previousState = true;

	public int getRemoteCode() {
		return remoteCode;
	}

	public String getCaKey() {
		return carKey;
	}

	public boolean isRaining() {
		return isRaining;
	}

	public boolean isPreviousState() {
		return previousState;
	}

}
