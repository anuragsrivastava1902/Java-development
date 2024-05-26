package sdet;

import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="loginData",dataProviderClass=LoginData.class)
	void loginTest(String email, String pass) {
		System.out.println(email+" : "+pass+"\n");
	}
}
