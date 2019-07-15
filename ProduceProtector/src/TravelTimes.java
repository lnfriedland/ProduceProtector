import java.math.BigDecimal;
import java.math.RoundingMode;

enum TravelTimes {
	Apple("apples", 40.86, 1.70),
	Asparagus("asparagus", 42.51, 1.77),
	Bell_Peppers("bell peppers", 42.51, 1.77),
	Blackberry("blackberry", 42.51, 1.77),
	Blueberry("bluebery", 8.06, 0.33),
	Broccoli("brocolli", 42.51, 1.77),
	Brussel_Sprouts("brussel sprouts", 42.51, 1.77),
	Cabbage("cabbage", 12.13, 0.50),
	Cantaloupe("cantaloupe", 11.85, 0.49),
	Carrots("carrots", 42.51, 1.77),
	Cauliflower("cauliflower", 42.51, 1.77),
	Cucumbers("cucumber", 12.13, 0.50),
	Eggplant("eggplant", 12.13, 0.50),
	Grapes("grapes", 42.51, 1.77),
	Garlic("garlic", 42.51, 1.77),
	Mushrooms("mushrooms", 0.0, 0.5),
	Onions("onions", 42.51, 1.77),
	Pears("pears", 40.86, 1.70),
	Plums("plums", 42.51, 1.77),
	Potatoes("potatoes", 35.35, 1.47),
	Radishes("radish", 17.36, 0.72),
	Raspberries("raspberry", 42.51, 1.77),
	Lettuce("lettuce", 42.51, 1.77),
	Snap_Beans("snap beans", 12.13, 0.50),
	Spinach("spinach", 42.51, 1.77),
	Strawberry("strawberry", 42.51, 1.77),
	Tomato("tomatoes", 42.51, 1.77),
	Watermelon("watermelon", 11.85, 0.49);
	
	private String name;
	private Double hours;
	private Double days;
	
	TravelTimes(String name, Double hours, Double days) {
		this.setName(name);
		this.setHours(hours);
		this.setDays(days);
	}
	
	public String toString() {
		return " | ";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public Double getDays() {
		return days;
	}

	public void setDays(Double days) {
		this.days = days;
	}
	
	public Integer getTravelTime() {
		return round(this.days);
	}
	
	private Integer round(double value) {
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(0, RoundingMode.HALF_UP);
	    return bd.intValue();
	}
}

