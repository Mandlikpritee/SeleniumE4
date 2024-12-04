package Testng;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreatingDependencies {
	@Test(timeOut = 1000)


	public void createAccount() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://www.royalchallengers.com/");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Create Account");
		
	}
          @Test(dependsOnMethods = "createAccount")
          public void modifyAccoount()
          {
        	  ChromeDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
      		driver.get("https://www.chennaisuperkings.com/");
      		driver.close();
    		System.out.println("Modify Account");

          }
          @Test(dependsOnMethods = "createAccount")
          public void deleteAccount()
          {
        	  ChromeDriver driver=new ChromeDriver();
      		driver.manage().window().maximize();
      		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
      		driver.get("https://www.mumbaiIndia.com/");
      		driver.close();
    		System.out.println("Delete Account");

        	  
	}}
