package methodFactory;

public class ElectricityBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for electricity bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("Electricity bill has been paid.");

	}

}
