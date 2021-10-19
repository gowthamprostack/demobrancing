package Apiautomation.Apiautomation;

import org.testng.annotations.DataProvider;

public class Dp {

	@DataProvider(name = "example")
	public Object[][] dpmethod()
	{
		return new Object[][]{{"sd"},{"sdds"},{"sds"}};
		
		
	}
	
	public void foo()
	{
		
	}
	
}
