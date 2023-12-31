package listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import test.Base_Test;
import utility.Scree;

public class Test_Listener extends Base_Test implements ITestListener  {
	
ExtentReports extent = Extentaaa.extentReportsgenerator();
	
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		 test = extent.createTest(result.getName());
	System.out.println("Test case "+result.getMethod().getMethodName()+" has been started");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case "+result.getMethod().getMethodName()+" has been passed");	
		test.log(Status.PASS, "Test case has been passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case "+result.getMethod().getMethodName()+" has been failed");		
		test.fail(result.getThrowable());
		
		try {
			
			test.addScreenCaptureFromPath(Scree.captureScreenshotWithPath(result.getName()));
					
		} catch (IOException e) {
			
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case "+result.getMethod().getMethodName()+" has been skipped");		
		test.log(Status.SKIP, "Test case has been skipped");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("Test tag "+context.getName()+" has been started");	
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag "+context.getName()+" has been finished");
		extent.flush();
	}
	
	

}
