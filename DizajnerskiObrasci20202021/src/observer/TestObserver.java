package observer;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cryptoCurrencyUpdateSMS = new CryptoCurrencyUpdateSMS();

		cryptoCurrencyPrice.addObserver(cryptoCurrencyUpdateSMS);

		cryptoCurrencyPrice.setBitcoinPrice(20000);
		cryptoCurrencyPrice.setEtherPrice(1000);
	}

}
