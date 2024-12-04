package com.crm.listeners;

import java.util.jar.Attributes.Name;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DwsExtentReport implements ITestListener{
	

	//@Override
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
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestSkipped");
test.log(Status.SKIP,name+"is Skipped" );
}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./src/main/resources/testcas1.html");
		spark.config().setDocumentTitle("honda kawasaki royal enfield");
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
