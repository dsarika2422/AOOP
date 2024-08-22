package SolidExamples;

public class MainSRP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee emp1 = new Employee("Alice", "Manager");
	        Employee emp2 = new Employee("Bob", "Developer");

	        SalaryCalculator calculator = new SalaryCalculator();

	        System.out.println(emp1.getName() + "'s Salary: " + calculator.calculateSalary(emp1));
	        System.out.println(emp2.getName() + "'s Salary: " + calculator.calculateSalary(emp2));
	}

}
