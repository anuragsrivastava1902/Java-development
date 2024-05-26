package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Starts test..."+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished test..."+context.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starts test..."+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test..."+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test..."+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped test..."+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

}
