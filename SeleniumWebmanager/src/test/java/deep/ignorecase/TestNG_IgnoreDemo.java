package deep.ignorecase;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG_IgnoreDemo {
	
	@Test
	public void test1()
	{
		System.out.println("inside test1");
	}
	@Test
	@Ignore
	public void test2()
	{
		System.out.println("inside test2");
	}
	@Test
	@Ignore
	public void test3()
	{
		System.out.println("inside test3");
	}
	@Test
	public void test4()
	{
		System.out.println("inside test4");
	}

}
