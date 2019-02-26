package testNGpractice;

import org.testng.annotations.Test;

public class InvocationTimeOut {
  
	
	@Test(invocationTimeOut=2000)
  public void infiniteLoopTest() {
		int i=1;
		while(i==10) {
			System.out.println(i);
			i++;
		}
		
  }
	
	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
	public void expectedException() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
		
  }
}
