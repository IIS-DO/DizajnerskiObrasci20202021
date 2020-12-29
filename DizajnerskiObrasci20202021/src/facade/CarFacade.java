package facade;

public class CarFacade {
	private Car car;

	private Unlock unlock;
	private Contact contact;
	private Wippers wippers;
	private Radio radio;

	public CarFacade(Car car, int remoteCode, String carKey) {
		this.car = car;
		unlock = new Unlock(car, remoteCode);
		contact = new Contact(car, carKey);
		wippers = new Wippers(car);
		radio = new Radio(car);
	}

	public String startTheCar() {
		if (unlock.unlockTheCar())
			if (contact.giveContact()) {
				wippers.autoStartWippers();
				radio.autoTurnOnRadio();
			}

		return unlock.getMessage() + " " + contact.getMessage() + " " + wippers.autoStartWippers() + " "
				+ radio.autoTurnOnRadio();
	}

}
