package Assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class AssetSoft {
	public void main() {
		EdgeDriver d=null;
		String exp_res="https://demowebshop.tricentis.com";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String act_res=driver.getCurrentUrl();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(exp_res, act_res,"I am not in DWS");
		Reporter.log("I am in DWS");
		WebElement register = driver.findElement(By.className("ico-register"));
		sa.assertTrue(register.isEnabled(),"register link is not enabled...");
		
	register.click();
	sa.assertNull(d);
	
	driver.close();
	sa.assertAll();
		
		
		
	}
}
