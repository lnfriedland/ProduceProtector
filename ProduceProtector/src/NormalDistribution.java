import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class NormalDistribution {
	private Double average;
	private Double stdDeviation;
	private ArrayList<Double> values;
	
	//set standard deviation to half the average
	public NormalDistribution(Double value) {
		this.setValue(value);
		this.setStdDeviation(value / 2);
	}

	public Double getValue() {
		return average;
	}

	public void setValue(Double value) {
		this.average = value;
	}

	public Double getStdDeviation() {
		return stdDeviation;
	}

	public void setStdDeviation(Double stdDeviation) {
		this.stdDeviation = stdDeviation;
	}
	
	//get gaussian value ceneted around our average and adjusted to the standard deviation
	//src https://www.programcreek.com/java-api-examples/?class=java.util.Random&method=nextGaussian
	private double getNextGaussian() {
		Double value = new Random().nextGaussian() * stdDeviation + average;
		return round(value, 1);
	}
	
	private double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_DOWN);
	    return bd.doubleValue();
	}
	
	public ArrayList<Double> getNormalDistribution(int numPoints) {
		values = new ArrayList<>();
		for(int i = 0; i < numPoints; i++) 
			values.add(getNextGaussian());
		
		return values;
	}
	
	public HashMap<Double, Integer> getFrequency() {
		HashMap<Double, Integer> occurrences = new HashMap<>();
		for (Double v : values) {
			occurrences.put(v, Collections.frequency(values, v));
		}
		return occurrences;
	}
}
