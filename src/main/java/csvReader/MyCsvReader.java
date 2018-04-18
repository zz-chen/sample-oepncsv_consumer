package csvReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class MyCsvReader {
	public static void main(String[] args) throws Exception {
		String fileName = "CsvFiles/syukujitsu_kyujitsu.csv";
		InputStreamReader nsr = new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8);
		CSVReader reader = new CSVReader(nsr);
		HeaderColumnNameMappingStrategy<Holiday> strategy = new HeaderColumnNameMappingStrategy<>();
		strategy.setType(Holiday.class);
		CsvToBean<Holiday> csvToBean = new CsvToBean<Holiday>();
		List<Holiday> Holidays = csvToBean.parse(strategy, reader);
		Holidays.forEach(System.out::println);
	}
}