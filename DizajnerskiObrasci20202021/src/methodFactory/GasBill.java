package methodFactory;

public class GasBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for gas bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("Gas bill has been paid.");

	}

}
