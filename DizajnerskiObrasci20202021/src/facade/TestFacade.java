package facade;

public class TestFacade {

	public static void main(String[] args) {
		Car car = new Car();

		CarFacade carFacade = new CarFacade(car, 1234, "sara");

		System.out.println(carFacade.startTheCar());

	}

}
