package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities_enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	public SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	public SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");

	public Worker() {
	}

	public Worker(String name, String level, Double baseSalary, Department department) {
		this.name = name;
		this.level = WorkerLevel.valueOf(level);
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void AddContract(HourContract contract) {
		contracts.add(contract);
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	@SuppressWarnings("deprecation")
	public Double income(Integer year, Integer month) {

		double total = 0.0;

		for (HourContract c : contracts) {

			if ((c.getDate().getMonth()) + 1 == 8 && (c.getDate().getYear()) + 1900 == 2018) {
				total += c.totalValue();
			}

		}

		return total + baseSalary;

	}

	public String toString() {
		
	StringBuilder sb = new StringBuilder();

	sb.append("Name: " + name + "\n");
	sb.append("Department: " + department.getName() + "\n");
	sb.append("Level: " + level);

	return sb.toString();

	}



}
