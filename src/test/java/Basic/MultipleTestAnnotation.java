package Basic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTestAnnotation {
	@Test(priority = -0)
	public void Rcb()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://www.royalchallengers.com/");
		driver.close();
	}
          @Test(priority = 1,invocationCount = 2,threadPoolSize = 2)
          public void csk()
          {
        	  ChromeDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
      		driver.get("https://www.chennaisuperkings.com/");
      		driver.close();
          }
          @Test(priority = 2)
          public void MI()
          {
        	  ChromeDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
      		driver.get("https://www.mumbaiIndia.com/");
      		driver.close();
        	  
	}
}
