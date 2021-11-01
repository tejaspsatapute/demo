package Com.testing;

import org.testng.annotations.Test;

public class TestNGParallelTestingDemo {
	
	@Test
	public void Test1() {
		
		System.out.println("I am inside Test 1  "+Thread.currentThread().getId());
		
	}
	@Test
	public void Test2() {
	System.out.println("I am inside Test 2 "+Thread.currentThread().getId());
	}
}
