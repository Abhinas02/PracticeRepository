package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class ParameterTest {
  
	WebDriver driver;

	//@DataProvider
	//public void getTestData()
	@Test
	//@Parameters({"url","firstname","lastname","email","password","mobilenumber","month","day","year","gender"})
	
	public void setUp () throws InterruptedException {//String url, String firstname, String lastname,String email,String password,String mobilenumber,String month, String day,String year,String gender) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhin\\Desktop\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("abhinas02");
		driver.findElement(By.xpath("//*[@id='createacc']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Abhinas");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Sahoo");
		driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys("abhinas.sphinx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-yid']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("Silu@002!!");
		driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("4692315501");
		driver.findElement(By.xpath("//select[@id='usernamereg-month']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id='usernamereg-month']")));
		select.selectByVisibleText("May");
		driver.findElement(By.xpath("//input[@id='usernamereg-day']")).sendKeys("14");
		driver.findElement(By.xpath("//input[@id='usernamereg-year']")).sendKeys("1987");
		driver.findElement(By.xpath("//input[@id='usernamereg-freeformGender']")).sendKeys("Male");
		driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
		
		
	}
}
