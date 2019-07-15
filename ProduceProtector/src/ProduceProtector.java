import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProduceProtector {
	public static void main(String[] args) {
		Fruits fruit = Fruits.Cherry;
		NormalDistribution distr = new NormalDistribution(fruit.getAverage());
		ArrayList<Double> values = distr.getNormalDistribution(5000);
		Collections.sort(values);
		System.out.println("Getting normal distribution for " + fruit.getSingular() + " with average " + fruit.getAverage() + " and std dev " + fruit.getAverage()/2);
		System.out.println("\nNormal Distrbution Values: \n" + values);

		//maps double value to it's occurrences
		HashMap<Double, Integer> occurrences = distr.getFrequency();
		System.out.println("\n\nFreqencies size: " + occurrences.size());
		
		// print values to excel sheet
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(fruit.name() + " Expritation Data");
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("Days Until Expiration");
		row.createCell(1).setCellValue("Frequency");
		
		int rownum = 1;
		for (Double key : occurrences.keySet()) {
			Row r = sheet.createRow(rownum++);
			r.createCell(0).setCellValue((Double) key);
			r.createCell(1).setCellValue((Integer) occurrences.get(key));
		}

		try {
			// Write the workbook in file system
			FileOutputStream out = new FileOutputStream(new File(fruit.getSingular() + ".xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("\n" + fruit.getSingular() + ".xlsx written successfully on disk.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
