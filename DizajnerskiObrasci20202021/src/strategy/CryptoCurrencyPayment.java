package strategy;

public class CryptoCurrencyPayment implements Payment {
	private String walletAddress;

	@Override
	public void pay(int amount) {
		System.out.println("CryptoCurrency payment finished");

	}

}
