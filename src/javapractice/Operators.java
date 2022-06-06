package javapractice;

public class Operators {

	public static void main(String[] args) {
		// Assignment topic
		// 1. Create variable of type int and store a value inside it, then find out if
		// the given number is even or odd

		// Operators are used to perform some operation

		// 1. Arithmetic Operator ( +,-,*,/,%(Modulo))
		// 2. Relational Operator (>,<,>=,<=,==(Equality),!=)
		// 3. Logical Operator (&&,||, !)
		// 4. Assignment Operator (=)
		// 5. Unary Operator (++(increment) / --(decrement)) 

		// Arithmetic operator

		int num_1 = 4; // declare and initialize
		int num_2; // declare
		num_2 = 20; // initialization
		int num_3;
		num_3 = num_1 + num_2; // 24
		System.out.println(num_3);
		int sub = num_2 - num_1; // 16

		int mul = num_3 * num_1; // 240
		int div = sub / num_1; // 4
		int di = 15 / 2; // 7 (quotient after division)
		short mod = 15 % 2; // 1 (remainder after division)
		float d = 15 / 2F;
		System.out.println(d);

		// Relational Operator
		boolean greater = 4 > 6; // false
		System.out.println(greater);
		boolean equals = 5 == 9; // false
		boolean equal = 5 == 5; // true
		System.out.println(equals + " " + equal);
		boolean notequal = 5 != 9; // true

		// Logical Operator

		boolean and = true && false; // false
		boolean or = true || false; // true
		boolean not = !true; // false
		System.out.println(and + " " + or + " " + not);

	}

}
