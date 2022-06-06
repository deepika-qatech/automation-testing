package javapractice;

public class LoopingStatement {

	int example;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// While loop
		// Do while loop
		// for loop

		// initialization
		// condition
		// increment/decrement

		// while
		int count = 1;
		while (count <= 10) {

			System.out.println("output of while " + count);
			count++; // count = count +1 ;
		}

		// Do while
		int num = 1;
		do {
			System.out.println("output of do while " + num);
			num++;
		} while (num <= 10);

		// for loop

		for (int i = 1; i <= 10; i++) {

			System.out.println("output of for loop " + i);
		}

	}

}
