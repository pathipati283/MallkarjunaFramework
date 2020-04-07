package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Annotations3 {
	@Test(dependsOnMethods= {"annotation3Test99"})
	public void annotation3Test9()
	{
		System.out.println("annotation3Test9");
	}
	@Test(dependsOnMethods= {"annotation3Test4"})
	public void annotation3Test2()
	{
		System.out.println("annotation3Test2");
	}
	@Test(dependsOnMethods= {"annotation3Test6"})
	public void annotation3Test4()
	{
		System.out.println("annotation3Test4");
	}
	@Test(dependsOnMethods= {"annotation3Test9"})
	public void annotation3Test6()
	{
		System.out.println("annotation3Test6");
	}
	@Test
	public void annotation3Test99()
	{
		System.out.println("annotation3Test99");
	}
  	 } 
  
  

