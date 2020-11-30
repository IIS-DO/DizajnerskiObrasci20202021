package observer3;

public class TestObserver3 {

	public static void main(String[] args) {

		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cryptoCurrencyUpdateSMS = new CryptoCurrencyUpdateSMS();

		cryptoCurrencyPrice.addPropertyChangeListener(cryptoCurrencyUpdateSMS);

		cryptoCurrencyPrice.setBitcoinPrice(30000);
		cryptoCurrencyPrice.setEtherPrice(2000);

	}

}
