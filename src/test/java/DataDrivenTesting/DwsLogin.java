package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwsLogin {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String act_res="https://demowebshop.tricentis.com/";
	driver.get(act_res);
	String exp_res=driver.getCurrentUrl();
	if (exp_res.equals(act_res)) {
		
		driver.findElement(By.linkText("Log in")).click();

		FileInputStream fis=new FileInputStream("D:\\login2.xlsx");
		Workbook wb   =WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String email=sheet.getRow(0).getCell(0).toString();
		String pwd=sheet.getRow(1).getCell(1).toString();
		System.out.println(email);
		System.out.println(pwd);
Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
	driver.findElement(By.id("small-searchterms"));
	
		

	
		
		System.out.println("In DWS");
	}
	else {
		System.out.println("not in DWS");
	}
	
}
}
