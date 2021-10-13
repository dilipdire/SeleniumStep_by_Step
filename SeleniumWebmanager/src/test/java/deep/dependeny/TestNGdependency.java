package deep.dependeny;

import org.testng.annotations.Test;

public class TestNGdependency {
	@Test(dependsOnMethods = {"test2","test3","test1"})
	public void test()
	{
		System.out.println("test1");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
@Test
	public void test2()
	{
		System.out.println("test2");
	}
@Test
public void test3()
{
	System.out.println("test3");
}
}
