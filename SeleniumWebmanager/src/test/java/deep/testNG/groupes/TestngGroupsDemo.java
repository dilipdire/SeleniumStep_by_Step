package deep.testNG.groupes;

import org.testng.annotations.Test;

public class TestngGroupsDemo {
	
	@Test(groups="senity")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(groups={"senity","smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test(groups={"senity","regrassion","smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("test1");
	}
	
}
