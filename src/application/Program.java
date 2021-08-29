package application;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		System.out.print("How many contracts to this worker? ");
		int quantityContracts = sc.nextInt();

		Worker worker = new Worker(name, level, baseSalary, new Department(department));

		for (int i = 0; i < quantityContracts; i++) {

			System.out.println("Enter contract #" + (i + 1) + " data:");
			sc.nextLine();
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = worker.sdf1.parse(sc.nextLine());
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract hourContract = new HourContract(hours, valueHour, date);

			worker.AddContract(hourContract);

		}

		sc.nextLine();
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String date = sc.nextLine();
		int mouth = Integer.parseInt(date.substring(0, 2));
		int year = Integer.parseInt(date.substring(3));

		System.out.println(worker);
		System.out.println("Income for: " + String.format("%02d", mouth) + "/" + year + " "
				+ String.format("%.2f", worker.income(year, mouth)));

		sc.close();
	}

}
