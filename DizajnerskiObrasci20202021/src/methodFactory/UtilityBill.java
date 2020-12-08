package methodFactory;

public class UtilityBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for utility bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("Utility bill has been paid.");

	}

}
