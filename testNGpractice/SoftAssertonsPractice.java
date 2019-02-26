package testNGpractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertonsPractice {
	
	SoftAssert sa = new SoftAssert(); 
  @Test
  public void softAssertion1() {
	  System.out.println("line 1");
	  sa.assertEquals(true, false, "random text 1");
	  
	  System.out.println("line 2");
	  sa.assertEquals(true, false,"random text 2");
	  
	  
	  System.out.println("line 3");
	  sa.assertEquals(true, false);
	  
	  
	  System.out.println("line 4");
	  sa.assertEquals(true, false);
	  
	  
	  System.out.println("line 5");
	 // Assert.assertEquals(true, false);
	  
	  
	  System.out.println("line 6");
	  
	  sa.assertAll();

  }
}
