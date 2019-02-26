package testNGpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGPractice2 {

	WebDriver driver;

	@BeforeClass
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhin\\Desktop\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	@Test(priority = 1, groups = "title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 2, groups = "logo")
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println(b);
	}

	@Test
	public void mailLinkTest() {
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'qmail')]")).isDisplayed();
		System.out.println(b);
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = 3, groups = "logo")
	public void test2() {
		System.out.println("test2");
	}

	@Test(priority = 4, groups = "title")
	public void test3() {
		System.out.println("test3");
	}

	@Test(priority = 5, groups = "tests")
	public void test4() {
		System.out.println("test4");
	}

	@Test(priority = 6, groups = "tests")
	public void test5() {
		System.out.println("test5");
	}

	@Test(priority = 7, groups = "tests")
	public void test6() {
		System.out.println("test6");
	}

	@Test
	public void test7() {
		System.out.println("test7");
	}

	@Test
	public void test8() {
		System.out.println("test8");
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
