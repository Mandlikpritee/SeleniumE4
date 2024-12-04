package com.crm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
//import org.testng.internal.annotations.IListeners;

public class DwsListners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();

		Reporter.log("onTestStart:"+name,true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
String name=result.getMethod().getMethodName();
Reporter.log("onTestFailure :"+name,true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		//String name=context.getMethod().getMethodName();
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
	//	String name=result.getMethod().getMethodName();
		Reporter.log("onFinish",true);
	}

}
