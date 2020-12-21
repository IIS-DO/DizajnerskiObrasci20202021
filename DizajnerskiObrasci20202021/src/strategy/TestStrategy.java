package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		Payment creditCardPayment = new CreditCardPayment();
		Payment cryptoCurrencyPayment = new CryptoCurrencyPayment();

		Payment paymentManager = new PaymentManager(creditCardPayment);

		paymentManager.pay(100);

		Payment paymentManager2 = new PaymentManager(cryptoCurrencyPayment);

		paymentManager2.pay(200);
	}

}
