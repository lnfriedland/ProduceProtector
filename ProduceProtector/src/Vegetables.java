import java.util.Arrays;
import java.util.List;

enum Vegetables {
	Artichoke("artichoke", "artichokes", Arrays.asList(new Integer[]{6, 6})),
	Asparagus("asparagus", "asparagus", Arrays.asList(new Integer[]{6, 3})),
	Broccoli("broccoli", "broccoli", Arrays.asList(new Integer[]{8, 4})),
	Brussel_Sprouts("brussel  sprout", "brussel  sprout", Arrays.asList(new Integer[]{10, 4})),
	Carrots("carrot", "carrots", Arrays.asList(new Integer[]{32, 24})),
	Cauliflower("cauliflower", "cauliflower", Arrays.asList(new Integer[]{14, 7})),
	Celery("celery", "celery", Arrays.asList(new Integer[]{24, 18})),
	Cucumber("cucumber", "cucumbers", Arrays.asList(new Integer[]{7, 7})),
	Eggplant("eggplant", "eggplants", Arrays.asList(new Integer[]{18, 6})),
	Lemongrass("lemongrass", "lemongrass", Arrays.asList(new Integer[]{18})),
	Iceberg_Lettuce("iceberg lettuce", "iceberg lettuce", Arrays.asList(new Integer[]{8, 8})),
	Romaine_Lettuce("romaine lettuce", "romaine lettuce", Arrays.asList(new Integer[]{8, 8})),
	Leaf_Lettuce("leaf lettuce", "leaf lettuce", Arrays.asList(new Integer[]{6, 7})),
	Butter_Lettuce("butter lettuce", "butter lettuce", Arrays.asList(new Integer[]{4, 4})),
	Chopped_Lettuce("chopped lettuce", "chopped lettuce", Arrays.asList(new Integer[]{3, 4})),
	Mushrooms("mushroom", "mushrooms", Arrays.asList(new Integer[]{8, 5})),
	Onions("onion", "onions", Arrays.asList(new Integer[]{35, 45})),
	Scallions("scallion", "scallions", Arrays.asList(new Integer[]{12, 18})),
	Parsnips("parsnip", "parsnips", Arrays.asList(new Integer[]{30, 25})),
	Green_Bell_Pepper("green bell pepper", "green bell peppers", Arrays.asList(new Integer[]{18, 18})),
	Red_Bell_Pepper("red bell pepper", "red bell peppers", Arrays.asList(new Integer[]{9, 18})),
	Yellow_Bell_Pepper("yellow bell pepper", "yellow bell peppers", Arrays.asList(new Integer[]{9, 18})),
	Orange_Bell_Pepper("orange bell pepper", "orange bell peppers", Arrays.asList(new Integer[]{9, 18})),
	Potatoes("potato", "potatoes", Arrays.asList(new Integer[]{90, 60})),
	Spinach("spinach", "spinach", Arrays.asList(new Integer[]{6, 6})),
	Squash("squash", "squash", Arrays.asList(new Integer[]{60, 45})),
	Sweet_Potato("sweet potato", "sweet potato", Arrays.asList(new Integer[]{70, 30})),
	Zucchini("zucchini", "zucchinis", Arrays.asList(new Integer[]{6, 5}));
	
	
	private String singular;
	private String plural;
	private List<Integer> values;
	
	private Vegetables(String singular, String plural, List<Integer> values) {
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

