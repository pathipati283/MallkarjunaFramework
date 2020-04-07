package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Annotations1 {
	//public String url="https://accounts.google.com/";
	public WebDriver driver;
	
 @BeforeMethod
 public void beforeMthod() {
	 System.out.println("Before Method");
 }
  @Parameters({"URL"})
  @Test
  public void openGoogleChrome1(String appurl)
	 {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");	
	  driver=new ChromeDriver();
	  driver.get(appurl);
	  System.out.println(appurl);
	 } 
  @Test(dependsOnMethods = {"openGoogleChrome1"})
  public void verifyTittle()
	 {
	  
	  String actual=driver.getTitle();
	  System.out.println(actual);
	  if(actual.equalsIgnoreCase("Sign in – Google accounts"))
	  {
		  System.out.println("Gmail");
	  }
	  else
	  {
		  System.out.println("Fail");
	  }
	  
	 } 
  @Test(dependsOnMethods = {"openGoogleChrome1"})
  public void clinkClick()
  
	 {
	  WebDriverWait wait=new WebDriverWait(driver, 30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-identifier='leelapothuru96@gmail.com']")));
	  WebElement text=driver.findElement(By.xpath("//a[text()='Help']"));
	  text.click();
	  
	 } 
  @AfterMethod
  public void quitwindow()
	 {
	  
	  System.out.println("After Method");
	 }
  	 } 
  
  

