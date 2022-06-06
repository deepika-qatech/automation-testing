package javapractice;

public class ContractEmployee extends Employee {

	public double bonus() {
		double bonus = 10000 * 0.3;

		System.out.println(bonus);
		return bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContractEmployee CE = new ContractEmployee();
		CE.EmpID = 104;
		CE.EmpName = "Reshma";
		CE.EmpDept = "Inventory Mnagement";
		CE.add();
		CE.display();
		CE.bonus();
	}

}
