package TestNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyFirstTestNGClass {

	@Test(priority = 1)
	public void TestCase_1() {

		System.out.println("TestCase_1 Executed");
	}

	@Test(priority = 2)
	public void TestCase_2() {

		System.out.println("TestCase_2 Executed");
	}

	@Test(priority = 1)
	public void TestCase_3() {

		System.out.println("TestCase_3 Executed");
	}

	@Test(priority = 2)
	public void TestCase_4() {

		System.out.println("TestCase_4 Executed");
	}

	@BeforeMethod
	public void Login() {

		System.out.println("Logged in");
	}
	
	@AfterMethod
	public void Logout() {

		System.out.println("Logged out");
	}

}






