package com.crm.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.DwsBase.DwsBase;

public class ListnersWithScreenshot extends DwsBase implements ITestListener {
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, name+" InTestSuccess");
		test.log(Status.PASS,name+" is success" );
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "OnTEstFailure");
test.log(Status.FAIL,name+"is failed" );
TakesScreenshot ts=(TakesScreenshot) driver;
String from = ts.getScreenshotAs(OutputType.BASE64);
test.addScreenCaptureFromBase64String(from);


	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestSkipped");
test.log(Status.SKIP,name+"is Skipped" );
}
	@Override

	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./src/main/resources/testcase.html");
		spark.config().setDocumentTitle("Listner Screenshot");
		spark.config().setReportName("Pritee");
		spark.config().setTheme(Theme.DARK);
		 report = new ExtentReports();
		 report.setSystemInfo("OS","linux");
		 report.setSystemInfo("browser", "chrome");
		 
		 report.attachReporter(spark);
			
			//report.flush();
		 
		
	}
	@Override

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
report.flush();	
}



}
