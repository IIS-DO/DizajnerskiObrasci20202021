package abstractFactory;

import methodFactory.Bill;

public abstract class BillFactory {

	public abstract Bill createBill(String type);

}
