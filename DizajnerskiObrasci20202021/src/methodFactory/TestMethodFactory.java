package methodFactory;

public class TestMethodFactory {

	public static void main(String[] args) {
		BillFactory billFactory = new BillFactory();
		BillManagement billManagement = new BillManagement(billFactory);

		billManagement.processBill("gas");
	}

}
