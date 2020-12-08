package abstractFactory;

import methodFactory.Bill;

public class TaxBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for tax bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("Tax bill has been paid.");

	}

}
