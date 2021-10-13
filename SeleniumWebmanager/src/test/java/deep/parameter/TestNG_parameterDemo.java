package deep.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_parameterDemo {
	
	@Test
	@Parameters({"Myname"})
	public void test(@Optional String name)
	{
		System.out.println("name "+name);
	}

}
