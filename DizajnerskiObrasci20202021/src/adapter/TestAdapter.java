package adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle plane = new Plane();
		Vehicle train = new Train();
		Boat boat = new Boat();
		Vehicle boatAdapter = new BoatAdapter(boat);

		car.goFaster();
		plane.goFaster();
		train.goFaster();
		boat.rowFaster();
		boatAdapter.goFaster();
	}

}
