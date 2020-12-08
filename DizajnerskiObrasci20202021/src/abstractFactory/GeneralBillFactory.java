package abstractFactory;

import methodFactory.Bill;
import methodFactory.ElectricityBill;
import methodFactory.GasBill;
import methodFactory.UtilityBill;

public class GeneralBillFactory extends BillFactory {

	@Override
	public Bill createBill(String type) {
		if (type.equals("electricity"))
			return new ElectricityBill();
		else if (type.equals("gas"))
			return new GasBill();
		else
			return new UtilityBill();
	}

}
