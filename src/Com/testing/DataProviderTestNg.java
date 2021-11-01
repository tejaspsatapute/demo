package Com.testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNg {
	@Test(dataProvider="GetData")
	public void Method1(String username,String password ) {
		System.out.println(username);
		System.out.println(password);
	}
	
 @DataProvider
 public Object[][] GetData() {
	  	Object[][] data=new Object[2][2];
	  	data[0][0]="test@test.com";
	  	data[0][1]="Secure@1234";
	  	data[1][0]="test1@test.com";
	  	data[1][1]="Secure@1234";
	  	return data;
	 
 }
}
