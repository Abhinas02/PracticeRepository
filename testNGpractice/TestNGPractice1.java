package testNGpractice;

import org.testng.annotations.*;

public class TestNGPractice1 {

	@BeforeSuite // 1
	public void setUp() {
		System.out.println("setUp");
	}

	@BeforeClass // 3
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}

	@BeforeTest // 2
	public void login() {
		System.out.println("login");
	}

	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("enterURL");
	}

	@Test // 5
	public void titleTest() {
		System.out.println("titleTest");
	}

	@AfterMethod // 6
	public void logOut() {
		System.out.println("logOut");
	}

	@AfterTest // 8
	public void afterTest() {
		System.out.println("afterTest");
	}

	@AfterClass // 7
	public void afterClass() {
		System.out.println("afterClass");
	}

	@AfterSuite // will be executed if we declare it in xml file
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}
