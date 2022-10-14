

public class Employee {

	public Employee(String name, Double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	private String name;
	private Double salary;
	private int workHours;
	private int hireYear;

	public double tax() {
		if (salary < 1000) {
			return salary;
		} else {
			return salary * 0.03;
		}
	}

	public double bonus() {

		if (workHours > 40) {

			int bonusHours = workHours - 40;
			return bonusHours * 30;
		}
		return 0;
	}

	public double raiseSalary() {

		int yearDifference = 2021 - hireYear;

		if (yearDifference < 9) {

			return totalSalaryWithTax() * 0.05;
		} else if (yearDifference > 9 && yearDifference < 20) {

			return totalSalaryWithTax() * 0.1;
		} else if (yearDifference > 19) {

			return totalSalaryWithTax() * 0.15;
		}

		return 0;

	}

	public double totalSalaryWithTax() {

		return salary + bonus() + tax();
	}

	public double totalSalary() {

		return salary + bonus();
	}

	public String toString() {

		return " Name: " + name + "\n Salary: " + salary + "\n Hours of Work: " + workHours + "\n Hire Year: "
				+ hireYear + " \n tax: " + tax() + "\n Bonus: " + bonus() + "\n Raise Of Salary: " + raiseSalary()+"\n Total Salary: "+totalSalary()
				+ " \n Total Salary With Tax " + totalSalaryWithTax();

	}

}
