package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Annotations5 {
	@Test
	public void annotation3Test1()
	{
		System.out.println("annotation3Test1");
	}
	@Test(groups= {"regression"})
	public void annotation3Test2()
	{
		System.out.println("annotation3Test2");
	}
	@Test(dependsOnMethods = {"annotation3Test1"})
	public void annotation3Test3()
	{
		System.out.println("annotation3Test3");
	}
	@Test(groups= {"smoke"})
	public void annotation3Test4()
	{
		System.out.println("annotation3Test4");
	}
  	 } 
  
  

