package br.com.deitel.cap.ten;

public class PayrollSystemTest {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		BaseCommissionEmployee baseCommissionEmployee = new BaseCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000,
				.04, 300);

		System.out.println("Employees processed individually:\n");

		System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s\n%s: $%,.2f\n\n", baseCommissionEmployee, "earned", baseCommissionEmployee.earnings());

		Employee[] employees = new Employee[4];
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = baseCommissionEmployee;

		System.out.println("Employees processed polymorphically:\n");

		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);

			if (currentEmployee instanceof BaseCommissionEmployee) {
				BaseCommissionEmployee employee = (BaseCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
			}

			System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings());
		}

		for (int j = 0; j < employees.length; j++) {
			System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
		}

	}
}