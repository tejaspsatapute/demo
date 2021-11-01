package Com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriority {

	@Test
	public void method1() {
		System.out.println("A is test1");
	}
	@Test(priority=0)
	public void method2() {
		System.out.println("B is test2");
}
	@Test(priority=1)
	public void method3() {
		System.out.println("C is Test3");
}
	@Test(priority=3)
	public void method4() {
		System.out.println("D is Test4");
}
	@Test(priority=2)
	public void method5() {
		System.out.println("E is Test5");
	}
	@Test
	public void method6() {
		System.out.println("F is Test6");
	}
}
//if priority is not assigned the TestNg will assign 0 by default and if priority it execute alphabetical order