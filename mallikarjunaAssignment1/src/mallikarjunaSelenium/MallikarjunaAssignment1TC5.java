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

public class MallikarjunaAssignment1TC5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //Set the property for Firefox Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://demoqa.com/html-contact-form/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Program Started");
	
		List<WebElement>links=driver.findElements(By.partialLinkText("Google Link"));
		for(WebElement text:links)
		{
			String textname=text.getText();
			System.out.println(textname);
			
		if(textname.endsWith("Link"))
		{
			
				
		    Thread.sleep(5000);
		    text.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		    System.out.println(driver.getCurrentUrl());
			break;
			
		}
		}
		//Handle the multiple windows 
	 Set<String>	allwindows=driver.getWindowHandles();
	 //Convert set to list
	 ArrayList<String> list=new ArrayList<>(allwindows);
	 //Swith to newly opened link
	 driver.switchTo().window(list.get(1));
	 System.out.println(driver.getCurrentUrl());
		//close the browser
		driver.quit();
		System.out.println("Program Ended");
		 	
	}

}
	