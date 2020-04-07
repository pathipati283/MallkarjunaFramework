package mallikarjunaSelenium.mallikarjunaSelenium;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class ListenerDemo {
  @Test
  public void login()
  {
	  System.out.println("Arjun");
	  
    }
  @Test
  public void login1()
  {
	  System.out.println("Skipped");
	  Assert.assertTrue(false);
	  
    }
  
  }

