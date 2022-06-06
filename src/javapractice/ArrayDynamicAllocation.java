package javapractice;

public class ArrayDynamicAllocation {
	
	//Create a array to store 5 data of different datatype using Object Class

	public static void main(String[] args) {

		String names[] = { "Ann", "jenny", "Smith", " ", "Henry" };
		
		System.out.println("Output of for loop");

		for (int i = 0; i <= names.length - 1; i++) {
			
			System.out.println( names[i]);
		}
		
		//Advanced for loop
		
		System.out.println("Output of for Advanced loop");
		
		for (String j : names) {

			System.out.println(j);
		}
	}

}
