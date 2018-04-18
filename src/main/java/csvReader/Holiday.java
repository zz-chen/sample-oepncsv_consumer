package csvReader;

import com.opencsv.bean.CsvBindByName;

public class Holiday {

	@CsvBindByName(column = "国民の祝日・休日月日", required = true)
	private String date;
	@CsvBindByName(column = "国民の祝日・休日名称", required = true)
	private String name;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Holiday [date=" + date + ", name=" + name + "]";
	}
}
