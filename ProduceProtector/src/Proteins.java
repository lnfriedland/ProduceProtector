import java.util.Arrays;
import java.util.List;

enum Proteins {
	Bacon("bacon", "bacon", Arrays.asList(new Integer[]{7, 5})),
	Beef("beef", "beef", Arrays.asList(new Integer[]{2, 3})),
	Chicken("chicken", "chicken", Arrays.asList(new Integer[]{2, 2})),
	Deli_Meat("deli meat", "deli meat", Arrays.asList(new Integer[]{5, 5})),
	Eggs("egg", "eggs", Arrays.asList(new Integer[]{21, 28})),
	Fish("fish", "fish", Arrays.asList(new Integer[]{2, 2})),
	Ham("ham", "ham", Arrays.asList(new Integer[]{7, 5})),
	Hot_Dogs("hot dog", "hot dogs", Arrays.asList(new Integer[]{10, 7})),
	Pork("pork", "pork", Arrays.asList(new Integer[]{2, 5})),
	Salmon("salmon", "salmon", Arrays.asList(new Integer[]{2, 2})),
	Shrimp("shrimp", "shrimp", Arrays.asList(new Integer[]{2, 2})),
	Sushi("sushi", "sushi", Arrays.asList(new Integer[]{1, 1})),
	Turkey("turkey", "turkey", Arrays.asList(new Integer[]{6, 3}));
	
	private String singular;
	private String plural;
	private List<Integer> values;
	
	private Proteins(String singular, String plural, List<Integer> values) {
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

