package abstractFactory;

import methodFactory.Bill;

public class KindergartenBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for kindergarten bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("Kindergarten bill has been paid.");

	}

}
