package Com.testing;

import org.testng.annotations.Test;

public class test3 {
	@Test(dependsOnMethods= {"method2","method4"})
	public void amethod1()
	{
		System.out.println(" test3 method1");
		
	}
	@Test
	public void method2()
	{
		System.out.println(" test3 method2");
	}		
	@Test(enabled=false)//if false then not executed else excuted
	public void method3()
	{
		System.out.println(" test3 method3");
	}	
	@Test
	public void method4()
	{
		System.out.println(" test3 method4");
	}		
	}
