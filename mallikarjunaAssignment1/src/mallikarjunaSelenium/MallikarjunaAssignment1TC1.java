package mallikarjunaSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MallikarjunaAssignment1TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Set the property for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//Launch the application
		driver.get("https://demoqa.com/selectable/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Add implicit wait for synchronization
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Program Started");
		//Find the list of web elements and store in List
	    List<WebElement> select=driver.findElements(By.xpath("//ol[@class='ui-selectable']//li"));
		
		 	for(WebElement item:select)
		 	{
		 		
		 	String itemname	=item.getAttribute("innerHTML");
		 	
		 	if(itemname.contains("Item"))
		 	{
		 		System.out.println("Item Enabled? "+item.isEnabled());
		 		//click on items one by one
		 		item.click();
		 		//Get the clicked item text
		 		System.out.println(item.getText());
		 		
		 	}
		 		    
		 	}
		 	//close the window
		 	driver.quit();
		 	System.out.println("Program Ended");
		 	
	}

}
