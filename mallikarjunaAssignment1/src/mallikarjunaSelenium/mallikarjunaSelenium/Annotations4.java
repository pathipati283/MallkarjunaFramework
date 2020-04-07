package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Annotations4 {
	@Test(groups= {"smoke"})
	public void annotation4Test1()
	{
		System.out.println("annotation4Test1");
	}
	@Test(groups= {"regression"})
	public void annotation4Test2()
	{
		System.out.println("annotation4Test2");
	}
	@Test(groups= {"smoke"})
	public void annotation4Test3()
	{
		System.out.println("annotation4Test3");
	}
	@Test(groups= {"regression"})
	public void annotation4Test4()
	{
		System.out.println("annotation4Test4");
	}
  	 } 
  
  

