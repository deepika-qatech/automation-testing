package javapractice;

public class ConditionalStatementEx {
	// write a program to print if the person is eligible to vote based on his age

	public static void main(String[] args) {
		// if condition
		// if else
		// Nested if else

		// if(condition) {statement }

		int i = 15;
		if (i > 10) {

			System.out.println("i is greater");

		}

		// if else

		if (i < 10) {
			System.out.println("i is smaller");
		} else {
			System.out.println("i is greater");
		}

		//Nested if else

		if (i == 10) {
			System.out.println("i is equal");
		} else if (i > 10) {
			System.out.println("i is smaller");
		} else {
			System.out.println("i is greater");
		}

	}

}
