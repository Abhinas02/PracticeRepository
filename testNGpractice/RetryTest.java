package testNGpractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class RetryTest {

	@Test
	public void t1() {

		Assert.assertEquals(false, true);
	}

	@Test
	public void t2() {

		Assert.assertEquals(false, true);
	}
}