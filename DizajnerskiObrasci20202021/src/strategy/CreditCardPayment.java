package strategy;

public class CreditCardPayment implements Payment {
	private String name;
	private String creditCardNumber;
	private String cvc;
	private String expirationDate;

	@Override
	public void pay(int amount) {
		System.out.println("CreditCard payment confirmed.");

	}

}
