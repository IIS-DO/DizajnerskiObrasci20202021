package builder;

public class TestBuilder {

	public static void main(String[] args) {
		Sandwitch.Builder builder = new Sandwitch.Builder("integralna");

		builder.spread("pavlaka").spread("tzatziki").meat("pecenica").salad("zelena").meat("suvi vrat")
				.dressing("kecap").spread("urnebes");

		Sandwitch sandwitch = builder.build();

		System.out.println(sandwitch);

		Sandwitch sandwitch2 = builder.meat("abc").spread("abc").build();

	}

}
