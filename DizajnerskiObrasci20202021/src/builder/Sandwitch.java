package builder;

import java.util.ArrayList;
import java.util.List;

public class Sandwitch {
	private String bread;
	private List<String> spreads;
	private List<String> meats;
	private List<String> salads;
	private List<String> dressings;

	/*
	 * public Sandwitch(String bread, String spread, String meat, String salad,
	 * String dressing) { this.bread = bread; spreads.add(spread); meats.add(meat);
	 * salads.add(salad); dressings.add(dressing); }
	 */

	public Sandwitch(Builder builder) {
		bread = builder.bread;
		spreads = builder.spreads;
		meats = builder.meats;
		salads = builder.salads;
		dressings = builder.dressings;
	}

	@Override
	public String toString() {
		return "Sandwitch [bread=" + bread + ", spreads=" + spreads + ", meats=" + meats + ", salads=" + salads
				+ ", dressings=" + dressings + "]";
	}

	public static class Builder {
		private String bread;
		private List<String> spreads;
		private List<String> meats;
		private List<String> salads;
		private List<String> dressings;

		public Builder(String bread) {
			this.bread = bread;
			spreads = new ArrayList<String>();
			meats = new ArrayList<String>();
			salads = new ArrayList<String>();
			dressings = new ArrayList<String>();
		}

		public Builder spread(String spread) {
			spreads.add(spread);
			return this;
		}

		public Builder meat(String meat) {
			meats.add(meat);
			return this;
		}

		public Builder salad(String salad) {
			salads.add(salad);
			return this;
		}

		public Builder dressing(String dressing) {
			dressings.add(dressing);
			return this;
		}

		public Sandwitch build() {
			return new Sandwitch(this);
		}
	}
}
