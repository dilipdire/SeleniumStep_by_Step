package deep.retryfailedcars;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class RetryFailedCare_Demo {
    @Test
	public void test1()
	{
		System.out.println("test 1");
	}
    
    @Test
   	public void test2()
   	{
   		System.out.println("test 2");
   		int i=1/0;
   	}
    @Test(retryAnalyzer = demo.retry.RetryAnalyzer.class)
   	public void test3()
   	{
   		System.out.println("test 3");
   		
   		Assert.assertTrue(0>1);
   	}
	
}
