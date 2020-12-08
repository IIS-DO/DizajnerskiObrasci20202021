package abstractFactory;

import methodFactory.Bill;

public class HousecleaningBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for Housecleaning bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("Housecleaning bill has been paid.");

	}

}
