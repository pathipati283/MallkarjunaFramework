package mallikarjunaSelenium.mallikarjunaSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlopalParaDemo {
	
	public WebDriver driver=null;
  @Test
  public void login() throws IOException {
	  Properties prop=new Properties();
	  FileInputStream fis=new FileInputStream("C:\\Selenium Workspace\\mallikarjunaAssignment1\\dataDriven.properties");
	  prop.load(fis);
	  if(prop.getProperty("browser").equals("firefox"))
	  {    System.setProperty("webdriver.gecko.driver", "C:\\Selenium Workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();
	  }
	  else if(prop.getProperty("browser").equals("chrome"))
	  {
		   driver=new ChromeDriver();
	  }
	  else
	  {
		   driver=new InternetExplorerDriver();
	  }
	  driver.get(prop.getProperty("url"));
  }
}
