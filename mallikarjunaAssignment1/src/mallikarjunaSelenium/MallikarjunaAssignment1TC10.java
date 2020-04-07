package mallikarjunaSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MallikarjunaAssignment1TC10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set the property for Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//Launch the browser
		WebDriver driver=new FirefoxDriver();
		//Launch the application
		driver.get("https://demoqa.com/datepicker/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Select the DOB 
		WebElement dob=driver.findElement(By.cssSelector("input#datepicker"));
		dob.sendKeys("06/25/1991");
		//Validate selected month
		WebElement month=driver.findElement(By.cssSelector("span.ui-datepicker-month"));
		System.out.println(month.getText());
		//Validate selected year
		WebElement year=driver.findElement(By.cssSelector("span.ui-datepicker-year"));
		System.out.println(year.getText());
		//Validate selected date
		WebElement date=driver.findElement(By.cssSelector("a[class*='active']"));
		System.out.println(date.getText());
		Thread.sleep(3000);		
	    //close the browser
		driver.quit();
		System.out.println("Program Ended");
		 	
	}

}


