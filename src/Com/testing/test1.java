package Com.testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void method1() {
		System.out.println("NormalTest1 method1");
	}
	@BeforeTest
	public void method2() {
		System.out.println("BeforeTest Test1 method2");
}
	@AfterTest
	public void method3() {
		System.out.println("AfterTest Test1 method3");
}
	@BeforeClass
	public void method4() {
		System.out.println("BeforeClass Test1 method4");
}
	@AfterClass
	public void method5() {
		System.out.println("@AfterClass Test1 method5");
	}
	@BeforeMethod
	public void method6() {
		System.out.println("BeforeMethod Test1 method6");
	}
	@AfterMethod
	public void method7() {
		System.out.println("AfterMethod Test1 method7");
	}
}

//Before Test(method)-It will runs only once
//Before Class(method) -It will runs only once
//Before Method(method)-It will run before every method
//Method 1     -It will run
//After Method(method)-It will run before every method
//Before Method(method)
//Method7
//After Method(method)
//After Class(method)
//After test(method)
