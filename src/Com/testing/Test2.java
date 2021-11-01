package Com.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
@AfterTest
	public void method1() {
		System.out.println("AfterTest Test2 method1");

	}
@BeforeTest
	public void method2() {
		System.out.println("BeforeTest Test2 method2");
}
@Test(groups= {"Smoke"})
	public void method3() {
		System.out.println("Normal TetTest2 method3");
}
@BeforeSuite
public void method4() {
	System.out.println("BeforeSuite Test2 method4");
}
@AfterSuite
public void method5() {
	System.out.println("AfterSuite Test2 method5");
}
}