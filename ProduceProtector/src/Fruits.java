import java.util.Arrays;
import java.util.List;

enum Fruits {
	Apple("apple", "apples", Arrays.asList(new Integer[]{49, 49})),
	Apricot("apricot", "apricots", Arrays.asList(new Integer[]{8, 4})),
	Avocado("avocado", "avocados", Arrays.asList(new Integer[]{8, 4})),
	Banana("banana", "bananas", Arrays.asList(new Integer[]{5, 6})),
	Blueberry("blueberry", "blueberries", Arrays.asList(new Integer[]{6, 10})),
	Cantaloupe("cantaloupe", "cantaloupes", Arrays.asList(new Integer[]{10, 4})),
	Cherry("cherry", "cherries", Arrays.asList(new Integer[]{6, 7})),
	Coconut("coconut", "coconuts", Arrays.asList(new Integer[]{14, 14})),
	Fig("fig", "figs", Arrays.asList(new Integer[]{6, 2})),
	Grapefruit("grapefruit", "grapefruits", Arrays.asList(new Integer[]{40, 24})),
	Grapes("grape", "grapes", Arrays.asList(new Integer[]{8, 9})),
	Honeydew("honeydew", "honeydew", Arrays.asList(new Integer[]{12, 6})),
	Kiwi("kiwi", "kiwis", Arrays.asList(new Integer[]{14, 30})),
	Lemon("lemon", "lemons", Arrays.asList(new Integer[]{35, 24})),
	Lime("lime", "limes", Arrays.asList(new Integer[]{35, 24})),
	Oranges("orange", "oranges", Arrays.asList(new Integer[]{35, 24})),
	Passion_Fruit("passion fruit", "passion fruits", Arrays.asList(new Integer[]{20, 6})),
	Peaches("peach", "peaches", Arrays.asList(new Integer[]{4, 4})),
	Pear("pear", "pears", Arrays.asList(new Integer[]{7, 6})),
	Pineapple("pineapple", "pineapples", Arrays.asList(new Integer[]{4, 4})),
	Pomegranate("pomegranate", "pomegranates", Arrays.asList(new Integer[]{21, 40})),
	Pumpkin("pumpkin", "pumpkins", Arrays.asList(new Integer[]{120, 120})),
	Strawberry("strawberry", "strawberries", Arrays.asList(new Integer[]{6, 5})),
	Tomato("tomato", "tomatoes", Arrays.asList(new Integer[]{14, 14})),
	Watermelon("watermelon", "watermelons", Arrays.asList(new Integer[]{16, 14}));
	
	
	private String singular;
	private String plural;
	private List<Integer> values;
	
	Fruits(String singular, String plural, List<Integer> values) {
		this.setSingular(singular);
		this.setPlural(plural);
		this.setValues(values);	
	}
	
	public String getSingular() {
		return singular;
	}
	
	public void setSingular(String singular) {
		this.singular = singular;
	}

	public String getPlural() {
		return plural;
	}

	public void setPlural(String plural) {
		this.plural = plural;
	}

	public List<Integer> getValues() {
		return values;
	}

	public void setValues(List<Integer> values) {
		this.values = values;
	}
	
	public void addValue(Integer v) {
		this.values.add(v);
	}

	public Double getAverage() {
		Double average = 0.0;
		for(int v : values) 
			average += v;
		average /= values.size();
		
		return average;
	}
	
	public String toString() {
		return getSingular() + " | " + getValues() + " | " + getAverage();
	}
}

