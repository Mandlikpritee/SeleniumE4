package ExtentReport;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BasicReport {
@Test
public void main() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	//create Extent sparkr eport
	File path=new File("./src/main/resources/Sample.html");
	ExtentSparkReporter spark=new ExtentSparkReporter(path);	
	spark.config().setDocumentTitle("CRM Vtiger");
	spark.config().setReportName("Manikandan");
	spark.config().setTheme(Theme.DARK);
	ExtentReports reports=new ExtentReports();
	reports.setSystemInfo("OS", "windows-10");
	reports.setSystemInfo("Browser", "chrome");
	reports.attachReporter(spark);
	ExtentTest test=reports.createTest("main");
	driver.close();
	reports.flush();
	
	
	
	

	
	
	
}
}
