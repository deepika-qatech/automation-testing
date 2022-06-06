package javapractice;

public class Employee {

	// Create Global variable empid,empname,empdept,empsal
	// Create methods display(), bonus()
	// bonus = empsal*0.5

	// Global Variable

	int EmpID;
	String EmpName;
	String EmpDept;

	// method is used to perform / implement logic
	// syntax for method

	// Access_modifier return_type method_name(arguments/parameter){ }

	// Types of methods
	// 1. With Return Type and Parameter
	// 2. Without Return Type and parameter
	// 3. with return type without parameter
	// 4. without return type and with parameter

	// 1. With Return Type and Parameter
	public int add(int a, int b) {

		int sum = a + b;
		return sum;
	}

	// 2. Without Return Type and parameter
	public void display() {

		System.out.println(EmpName);
		System.out.println(EmpID);
		System.out.println(EmpDept);
	}

	// 3. with return type without parameter
	public int add() {
		int a = 20;
		int b = 30;
		int sum = a + b;
		return sum;
	}

	// 4. without return type and with parameter
	public void display(String empDept) {
		System.out.println(empDept);
	}

	public double bonus() {
		double bonus = 10000 * 0.5;
		System.out.println(bonus);
		return bonus;
	}

	public static void main(String[] args) {

		Employee Emp_1 = new Employee(); // object initialize
		Emp_1.EmpID = 102;
		Emp_1.EmpName = "Hetal";
		Emp_1.display(); //

		Employee Emp_2 = new Employee(); // object initialize
		Emp_2.EmpID = 103;
		Emp_2.EmpName = "Mital";
		Emp_2.display(); //

		int empid = 101;
		String empname = "Deepika";
		String empdept = "Dev";
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empdept);

		Emp_2.display("Development"); //
		Emp_2.add(10, 20);
		System.out.println(Emp_2.add(10, 20) + 40);

	}

}
