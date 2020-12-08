package abstractFactory;

import methodFactory.Bill;

public class HomeBillFactory extends BillFactory {

	@Override
	public Bill createBill(String type) {
		if (type.equals("kindergarten"))
			return new KindergartenBill();
		else
			return new HousecleaningBill();
	}

}
