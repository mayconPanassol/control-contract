package entities;

import java.util.Date;

public class HourContract {

	private Integer hours;
	private Double valueHour;
	private Date date;

	public HourContract() {
	}

	public HourContract(Integer hours, Double valueHour, Date date) {
		this.date = date;
		this.hours = hours;
		this.valueHour = valueHour;
	}

	public void setHour(Integer hours) {
		this.hours = hours;
	}

	public Integer getHour() {
		return hours;
	}

	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}

	public Double getValueHour() {
		return valueHour;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}

	public Double totalValue() {
		return hours * valueHour;
	}















}

