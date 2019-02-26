package com.screenshots.practice;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomHandler {

	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhin\\Desktop\\Java\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

	}

	public void failed(String testMethodName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File(
				"C:\\Users\\abhin\\Desktop\\Java\\Workspace\\TestNGPractice\\Screenshots\\" + testMethodName + ".jpg"));
	}

}
