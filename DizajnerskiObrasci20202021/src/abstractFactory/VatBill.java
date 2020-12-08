package abstractFactory;

import methodFactory.Bill;

public class VatBill implements Bill {

	@Override
	public void calculateTotal() {
		System.out.println("Total for VAT bill has been calculated.");

	}

	@Override
	public void pay() {
		System.out.println("VAT bill has been paid.");

	}

}
