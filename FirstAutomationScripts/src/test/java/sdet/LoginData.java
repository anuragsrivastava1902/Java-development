package sdet;

import org.testng.annotations.DataProvider;

public class LoginData {

	@DataProvider(name="loginData")
	public Object[][] getData(){
		Object[][] data = {{"anurag@gamil.com","anurag"},{"shivam@gmail.com","shivam"},{"dhananjay@gmail.com","dhananjay"}};
		return data;
	}
}
