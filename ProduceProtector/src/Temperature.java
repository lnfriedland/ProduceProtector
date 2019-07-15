enum Growth {
	LOW, MEDIUM, HIGH;
}

enum Temperature {
	Fish_0("fish", 0, Growth.LOW),
	Fish_4("fish", 4, Growth.LOW),
	Fish_10("fish", 10, Growth.MEDIUM),
	Meat_0("meat", 0, Growth.LOW),
	Meat_4("meat", 4, Growth.LOW),
	Meat_10("meat", 8, Growth.LOW),
	Meat_12("meat", 12, Growth.MEDIUM),
	Grains_20("grains", 20, Growth.LOW),
	Grains_25("grains", 25, Growth.MEDIUM),
	Grains_30("grains", 30, Growth.MEDIUM),
	Grains_35("grains", 35, Growth.HIGH),
	Fruits_4("meat", 4, Growth.LOW),
	Fruits_8("meat", 8, Growth.LOW),
	Fruits_12("meat", 12, Growth.LOW),
	Fruits_20("meat", 20, Growth.MEDIUM),
	Vegetable_20("vegetables", 20, Growth.LOW),
	Vegetable_25("vegetables", 25, Growth.MEDIUM),
	Vegetable_30("vegetables", 30, Growth.HIGH),
	Vegetable_35("vegetables", 35, Growth.HIGH);
	
	private String name;
	private Integer temperatureCelcius;
	private Growth growthRate;
	
	Temperature(String name, Integer temperature, Growth growthRate) {
		this.setName(name);
		this.setTemperature(temperature);
		this.setGrowthRate(growthRate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTemperature() {
		return temperatureCelcius;
	}

	public void setTemperature(Integer temperature) {
		this.temperatureCelcius = temperature;
	}

	public Growth getGrowthRate() {
		return growthRate;
	}

	public void setGrowthRate(Growth growthRate) {
		this.growthRate = growthRate;
	}
}

