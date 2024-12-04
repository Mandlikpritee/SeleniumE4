package PageObjectModel;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsHomePage;

public class HomePage {
	@Test
	public void homePage() throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
assertEquals("https://demowebshop.tricentis.com/", driver.getCurrentUrl());
DwsHomePage ref=new DwsHomePage(driver);
ref.title();
ref.register();
ref.shopingCart();
ref.search_field("Laptop");
ref.searchBtnClick();
ref.book();
ref.computer();
ref.electronic();
ref.shoes();
ref.digital();
ref.jwelary();
ref.title();

ref.nwsteller("admin@gmail.com");
ref.subscribe();
ref.excellent();
ref.good();

ref.vote();


}
}