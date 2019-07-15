
enum Humidity {
	Asparagus("asparagus", 85, 95),
	Beets("beets", 85, 95),
	Brocolli("Brocolli", 85, 95),
	Cabbage("cabbage", 85, 95),
	Carrots("carrots", 85, 95),
	Cauliflower("cauliflower", 85, 95),
	Celery("celery", 85, 95),
	Peas("peas", 85, 95),
	Radishes("radish", 85, 95),
	Scallions("scallions", 85, 95),
	Lettuce("lettuce", 85, 95),
	Pumpkins("pumpkin", 0, 85),
	Squash("squash", 0, 85),
	Onions("onions", 0, 85),
	Garlic("garlic", 0, 85),
	Apples("apples", 95, Integer.MAX_VALUE),
	Cherry("cherry", 95, Integer.MAX_VALUE),
	Peach("peaches", 95, Integer.MAX_VALUE),
	Pear("pears", 95, Integer.MAX_VALUE),
	Plums("plums", 95, Integer.MAX_VALUE),
	Apricots("apricots", 95, Integer.MAX_VALUE),
	Avocados("avocados", 95, Integer.MAX_VALUE),
	Berries("strawberry blackberry raspberry", 95, Integer.MAX_VALUE),
	Grapes("grapes", 0, 85),
	Melons("watermelon cantaloupe", 0, 85),
	Lemons("lemons", 0, 85),
	Limes("limes", 0, 85),
	Grapefruit("grapefruit", 0, 85),
	Oranges("oranges", 0, 85);
	
	private String name;
	private Integer lowerBound;
	private Integer upperBound;
	
	Humidity(String name, Integer lowerBound, Integer upperBound) {
		this.setName(name);
		this.setUpperBound(upperBound);
		this.setLowerBound(lowerBound);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(Integer lowerBound) {
		this.lowerBound = lowerBound;
	}

	public Integer getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(Integer upperBound) {
		this.upperBound = upperBound;
	}
	
	public boolean humidityIsOptimal(Integer humidityLevel) {
		return (humidityLevel >= lowerBound) && (humidityLevel <= upperBound);
	}
}

