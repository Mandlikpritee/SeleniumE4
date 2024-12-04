package Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Guru99 {
	@Test
public void rightClick() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Actions act=new Actions(driver);
	WebElement rigt_clik=driver.findElement(By.xpath("//span[text()='right click me']"));
	act.contextClick(rigt_clik).perform();
	List<WebElement> options=driver.findElements(By.xpath("//ul/li/span"));
	for (WebElement web : options) {
act.click(web).perform();
Thread.sleep(3000);
		driver.switchTo().alert().accept();
		rigt_clik=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rigt_clik).perform();
	}
}
	@Test
	public void doubleClick() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(double_click).perform();
		driver.switchTo().alert().accept();
		
	}
}
