package testNGpractice;

import org.testng.annotations.Test;

public class TestNGPractice3 {
  
	@Test
	public void loginTest() {
		System.out.println("Login test");
		//int i =1/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("Homepage test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registrationPage() {
		System.out.println("registrationPage test");
	}
}
