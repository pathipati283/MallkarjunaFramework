package mallikarjunaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MallikarjunaAssignment1TC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set the property for Firefox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Workspace\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//Launch the browser
		WebDriver driver=new FirefoxDriver();
		//Launch the application
		driver.get("https://demoqa.com/html-contact-form/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Program Started");
		//Enter First name	    
		WebElement firstname=driver.findElement(By.cssSelector("input.firstname"));
		firstname.sendKeys("!@#$");
		//Enter Last name
		WebElement lastname=driver.findElement(By.cssSelector("input#lname"));
		lastname.sendKeys("#$%^&");
		//Enter country name
		WebElement country=driver.findElement(By.xpath("//input[@name='country']"));
		country.sendKeys(" ");
		//Enter subject
		WebElement subject=driver.findElement(By.xpath("//textarea[@id='subject']"));
		subject.sendKeys("#$%^&");
		System.out.println("Before submit form "+driver.getCurrentUrl());
		//Click on submit button
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();		
		WebElement message=driver.findElement(By.xpath("//h1[contains(text(),'Oops')]"));
		System.out.println(message.getText());
		System.out.println("After submit form "+driver.getCurrentUrl());
		//close the browser
		driver.quit();
		System.out.println("Program Ended");
		 	
	}

}
