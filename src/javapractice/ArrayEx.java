package javapractice;

public class ArrayEx {

	public static void main(String[] args) {

		// Array is used to store data of same datatype
		// create an array to store 5 String data

		int i; // declaration
		i = 100; // initialization
		System.out.println(i); // fetching data

		// Array Declaration
		int num[] = new int[10];

		// Array initialization

		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		num[4] = 500;

		// fetching data from array

		System.out.println(num[0]);// 100

		for (int j = 0; j <= num.length - 1; j++) {

			System.out.println(num[j]);

		}

	}

}
