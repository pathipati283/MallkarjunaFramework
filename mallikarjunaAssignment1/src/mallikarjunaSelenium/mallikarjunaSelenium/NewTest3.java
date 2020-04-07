package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest3 {
	
  @Test
  public void openGoogleChrome3()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest3 "+driver.getTitle());
	 driver.quit();
	 } 
  
  }

