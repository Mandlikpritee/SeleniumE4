package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLogin;

public class Login {
	@Test
	public void main() {
//String exp_res="https://demowebshop.tricentis.com/";
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
assertEquals("https://demowebshop.tricentis.com/",driver.getCurrentUrl());
DwsLogin ref=new DwsLogin(driver);
ref.login("admin01@gmail.com", "admin01");


	}
}
