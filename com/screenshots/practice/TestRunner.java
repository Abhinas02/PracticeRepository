package com.screenshots.practice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListener.class)
public class TestRunner extends CustomHandler {

	@BeforeTest
	public void setUp() {
		initialization();
	}

	@AfterTest
	public void tearDown() {
		driver.close();

	}

	@Test
	public void takeScreenshotTest1() throws IOException {
		Assert.assertEquals(true, false);
		// failed(result.getMethod().getMethodName());
	}

	@Test
	public void takeScreenshotTest2() throws IOException {
		Assert.assertEquals(true, false);
		// failed(result.getMethod().getMethodName());
	}

	@Test
	public void takeScreenshotTest3() throws IOException {
		Assert.assertEquals(true, false);
		// failed(result.getMethod().getMethodName());
	}

	@Test
	public void takeScreenshotTest4() throws IOException {
		Assert.assertEquals(true, false);
		// failed(result.getMethod().getMethodName());
	}

	@Test
	public void takeScreenshotTest5() throws IOException {
		Assert.assertEquals(true, false);
		// failed(result.getMethod().getMethodName());
	}
}