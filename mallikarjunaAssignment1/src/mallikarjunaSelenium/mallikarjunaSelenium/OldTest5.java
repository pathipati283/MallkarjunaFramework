package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OldTest5 {
	
  @Test
  public void openGoogleChrome1()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("OldTest2 "+driver.getTitle());
	 driver.quit();
	 } 
  
  }

