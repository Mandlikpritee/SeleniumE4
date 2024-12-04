package BAtchExecution;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
@Test
public void honda(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.honda2wheelersindia.com/");
	driver.close();
	
}
@Test
public void kawasaki(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://kawasaki-india.com/");
	assertEquals("anish", "annish");
	driver.close();
	assertEquals("java", "java1");

	
}
@Test(dependsOnMethods = "kawasaki")
public void royalEnfield(){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.royalenfield.com/");
	driver.close();
	
}
}
