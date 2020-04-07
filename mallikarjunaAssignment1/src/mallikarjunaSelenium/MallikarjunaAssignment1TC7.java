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

public class MallikarjunaAssignment1TC7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //Set the property for Firefox Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://demoqa.com/droppable/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Program Started");
		//Find the the source web element
		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
		//Find the the Target web element
		 WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
		 Actions action=new Actions(driver);
		 System.out.println("Before drag and drop--- "+drop.getText());
		 action.dragAndDrop(drag, drop).build().perform();	
		 System.out.println("After drag and drop--- "+drop.getText());
		//close the browser
		driver.quit();
		System.out.println("Program Ended");
		 	
	}

}
