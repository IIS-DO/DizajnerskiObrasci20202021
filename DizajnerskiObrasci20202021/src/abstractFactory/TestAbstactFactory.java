package abstractFactory;

public class TestAbstactFactory {

	public static void main(String[] args) {
		BillFactory billFactory = new HomeBillFactory();
		BillManagment billManagment = new BillManagment(billFactory);

		billManagment.processBill("kindergarten");
	}

}
