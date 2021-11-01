package Com.testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void method1() {
		System.out.println("Method1");
	}
	@Test
	public void method2() {
		System.out.println("Method2");
	}
	@BeforeTest
	public void method3() {
		System.out.println("Method3");
	}
}
