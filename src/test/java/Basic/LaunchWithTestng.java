package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchWithTestng {
	@Test
	public void main () {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/login");
		 driver.close();
		 main1();
}
		 
		 public void main1()
		 {
			 System.out.println("Hello World");
		 }
}
