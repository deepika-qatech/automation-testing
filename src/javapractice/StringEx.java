package javapractice;

public class StringEx {

	public static void main(String[] args) {
		// Write a program to reverse the given string "welcome".( using charAt, length, for loop)
		
		String s1 = "hello";
		String s2 = "World";
		String s3 = "HELLO";
		System.out.println("Hello World");
		System.out.println(s1 + " " + s2);// + --> Concatenation operator
		System.out.println("Hello" + " World");
		System.out.println(s1.concat(s2));// HelloWorld
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.equals(s3));// false
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.length()); // length of the string 5 
		System.out.println(s2.contains("ld"));//true
		System.out.println(s3.charAt(3));//L
		System.out.println(s3.toLowerCase());// hello
		System.out.println(s1.toUpperCase());// HELLO
		System.out.println(s1.replace('l', 'r'));// herro
		
	}

}
