package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest1 {
	WebDriver driver;
  @Test
  public void openGoogleChrome1()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 } 
  @Test
  public void leelaOpenGoogleChrome2()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 } 
  @Test
  public void arjunOpenGoogleChrome3()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 } 
  @Test
  public void leelaOpenGoogleChrome4()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 } 
  @Test
  public void leelaOpenGoogleChrome5()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 } 
  @Test
  public void arjunOpenGoogleChrome6()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 } 
  @Test
  public void arjunOpenGoogleChrome7()
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	 driver.findElement(By.name("q")).sendKeys("Arjun");
	 System.out.println("NewTest1 "+driver.getTitle());
	 driver.quit();
	 }
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 System.out.println("Before method");
		 
	 }
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("after method");
		 
	 }
	 } 
  
  

