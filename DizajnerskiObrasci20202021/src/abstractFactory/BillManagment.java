package abstractFactory;

import methodFactory.Bill;

public class BillManagment {
	Bill bill;
	BillFactory billFactory;

	public BillManagment(BillFactory billFactory) {
		this.billFactory = billFactory;
	}

	public void processBill(String type) {
		bill = billFactory.createBill(type);

		bill.calculateTotal();
		bill.pay();
	}
}
